package io.github.erfangc.raincove.finser.configurations;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.CassandraClusterFactoryBean;
import org.springframework.data.cassandra.config.CassandraCqlClusterFactoryBean;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.core.cql.keyspace.CreateKeyspaceSpecification;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableCassandraRepositories("io.github.erfangc.raincove.finser.repositories.cassandra")
public class TestCassandraConfiguration extends AbstractCassandraConfiguration {

    private static String keyspace = "raincove";

    @Override
    public SchemaAction getSchemaAction() {
        return SchemaAction.CREATE_IF_NOT_EXISTS;
    }

    @Override
    public CassandraClusterFactoryBean cluster() {
        CassandraCqlClusterFactoryBean bean = new CassandraCqlClusterFactoryBean();
        bean.setKeyspaceCreations(keyspaceSpecifications());
        bean.setContactPoints("localhost");
        bean.setPort(9142);
        return bean;
    }

    private List<CreateKeyspaceSpecification> keyspaceSpecifications() {
        List<CreateKeyspaceSpecification> ret = new ArrayList<>();
        CreateKeyspaceSpecification kss = CreateKeyspaceSpecification
                .createKeyspace(keyspace)
                .ifNotExists(true)
                .withSimpleReplication();
        ret.add(kss);
        return ret;
    }

    @Override
    protected String getKeyspaceName() {
        return keyspace;
    }

    @Override
    public String[] getEntityBasePackages() {
        return new String[]{
                "io.github.erfangc.raincove.finser.models"
        };
    }
}
