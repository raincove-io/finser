package io.github.erfangc.raincove.finser.services;

import io.github.erfangc.raincove.finser.ApiException;
import io.github.erfangc.raincove.finser.configurations.TestCassandraConfiguration;
import io.github.erfangc.raincove.finser.models.*;
import io.github.erfangc.raincove.finser.repositories.cassandra.CompaniesRepository;
import io.github.erfangc.raincove.finser.repositories.cassandra.FinancialStatementRepository;
import org.apache.thrift.transport.TTransportException;
import org.cassandraunit.utils.EmbeddedCassandraServerHelper;
import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.security.Principal;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestCassandraConfiguration.class)
public class FinserTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    @Autowired
    private FinancialStatementRepository statementRepository;
    @Autowired
    private CompaniesRepository companiesRepository;
    private Finser finser;
    private Principal principal;

    @BeforeClass
    public static void beforeClass() throws InterruptedException, IOException, TTransportException {
        EmbeddedCassandraServerHelper.startEmbeddedCassandra();
    }

    @After
    public void tearDown() {
        EmbeddedCassandraServerHelper.cleanEmbeddedCassandra();
    }

    @Before
    public void setUp() {
        finser = new Finser(statementRepository, companiesRepository);
        principal = () -> "emma";
    }

    @Test
    public void createOrUpdateCompany() {
        CreateOrUpdateCompanyRequest body = new CreateOrUpdateCompanyRequest()
                .setCompany(new Company().setId("MSFT").setSector("Technology"));
        final CreateOrUpdateCompanyResponse resp = finser.createOrUpdateCompany(body, principal);
        assertEquals("Created", resp.getMessage());
        final CreateOrUpdateCompanyResponse resp2 = finser.createOrUpdateCompany(body, principal);
        assertEquals("Updated", resp2.getMessage());
    }

    @Test
    public void getCompany() {
        CreateOrUpdateCompanyRequest body = new CreateOrUpdateCompanyRequest()
                .setCompany(new Company().setId("MSFT").setSector("Technology"));
        finser.createOrUpdateCompany(body, principal);
        final GetCompanyResponse resp = finser.getCompany("MSFT");
        final Company company = resp.getCompany();
        assertEquals("MSFT", company.getId());
        assertEquals("emma", company.getCreatedBy());
    }

    @Test
    public void deleteCompany() {
        CreateOrUpdateCompanyRequest body = new CreateOrUpdateCompanyRequest()
                .setCompany(new Company().setId("AAPL"));
        finser.createOrUpdateCompany(body, principal);
        final DeleteCompanyResponse resp = finser.deleteCompany("AAPL");
        assertEquals("Deleted", resp.getMessage());
        expectedException.expect(ApiException.class);
        expectedException.expectMessage("Company with id AAPL cannot be found");
        finser.getCompany("AAPL");
    }

    @Test
    public void getFinancialStatements() {
        CreateOrUpdateFinancialStatementsRequest body = new CreateOrUpdateFinancialStatementsRequest()
                .setFinancialStatements(Collections.singletonList(new FinancialStatement().setCompanyId("MSFT").setId("20160331-10K")));
        finser.createOrUpdateFinancialStatements(body, "MSFT", principal);
        final GetFinancialStatementsResponse resp = finser.getFinancialStatements("MSFT");
        assertEquals(1, resp.getFinancialStatements().size());
    }

    @Test
    public void deleteFinancialStatements() {
        CreateOrUpdateFinancialStatementsRequest body = new CreateOrUpdateFinancialStatementsRequest()
                .setFinancialStatements(Collections.singletonList(new FinancialStatement().setCompanyId("AAPL").setId("20160331-10K")));
        finser.createOrUpdateFinancialStatements(body, "AAPL", principal);
        DeleteFinancialStatementsResponse resp = finser.deleteFinancialStatements("AAPL");
        assertEquals("Deleted 1 statements, 0 failed to delete", resp.getMessage());
        final GetFinancialStatementsResponse resp2 = finser.getFinancialStatements("AAPL");
        assertEquals(0, resp2.getFinancialStatements().size());
    }

    @Test
    public void createOrUpdateFinancialStatements() {
        CreateOrUpdateFinancialStatementsRequest body = new CreateOrUpdateFinancialStatementsRequest()
                .setFinancialStatements(Collections.singletonList(new FinancialStatement().setCompanyId("AAPL").setId("20160331-10K")));
        final CreateOrUpdateFinancialStatementsResponse resp = finser.createOrUpdateFinancialStatements(body, "AAPL", principal);
        assertEquals("Created 1, updated 0, succeed 1, failed 0", resp.getMessage());
        final CreateOrUpdateFinancialStatementsResponse resp2 = finser.createOrUpdateFinancialStatements(body, "AAPL", principal);
        assertEquals("Created 0, updated 1, succeed 1, failed 0", resp2.getMessage());
    }

    @Test
    public void getFinancialStatement() {
        CreateOrUpdateFinancialStatementsRequest body = new CreateOrUpdateFinancialStatementsRequest()
                .setFinancialStatements(Collections.singletonList(new FinancialStatement().setCompanyId("GE").setId("20160331-10K")));
        finser.createOrUpdateFinancialStatements(body, "GE", principal);
        final GetFinancialStatementResponse resp = finser.getFinancialStatement("GE", "20160331-10K");
        assertEquals("20160331-10K", resp.getFinancialStatement().getId());
    }

    @Test
    public void deleteFinancialStatement() {
        CreateOrUpdateFinancialStatementsRequest body = new CreateOrUpdateFinancialStatementsRequest()
                .setFinancialStatements(Collections.singletonList(new FinancialStatement().setCompanyId("AAPL").setId("20160331-10K")));
        finser.createOrUpdateFinancialStatements(body, "AAPL", principal);
        final DeleteFinancialStatementResponse resp = finser.deleteFinancialStatement("AAPL", "20160331-10K");
        assertEquals("Deleted", resp.getMessage());
        expectedException.expect(ApiException.class);
        expectedException.expectMessage("Financial statement with id 20160331-10K for company AAPL cannot be found");
        finser.getFinancialStatement("AAPL", "20160331-10K");
    }

    @Test
    public void searchFinancialStatements() {
    }
}