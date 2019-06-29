package io.github.erfangc.raincove.finser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.CassandraClusterFactoryBean;
import org.springframework.data.cassandra.config.CassandraCqlClusterFactoryBean;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.core.cql.keyspace.CreateKeyspaceSpecification;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class CassandraConfiguration extends AbstractCassandraConfiguration {

    private static final Logger logger = LoggerFactory.getLogger(CassandraConfiguration.class);
    private String keyspace = "raincove";

    @Override
    public SchemaAction getSchemaAction() {
        return SchemaAction.CREATE_IF_NOT_EXISTS;
    }

    @Override
    public CassandraClusterFactoryBean cluster() {
        String contactPoints = System.getenv("CONTACT_POINTS");
        if (contactPoints == null) {
            contactPoints = "localhost";
        }
        CassandraCqlClusterFactoryBean bean = new CassandraCqlClusterFactoryBean();
        logger.info("Using Cassandra contact points={}, keyspace={}", contactPoints, keyspace);
        bean.setKeyspaceCreations(keyspaceSpecifications());
        bean.setContactPoints(contactPoints);
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
}
