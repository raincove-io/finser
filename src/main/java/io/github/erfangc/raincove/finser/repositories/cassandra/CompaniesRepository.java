package io.github.erfangc.raincove.finser.repositories.cassandra;

import io.github.erfangc.raincove.finser.models.Company;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompaniesRepository extends CassandraRepository<Company, String> {
}
