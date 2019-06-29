package io.github.erfangc.raincove.finser.repositories.cassandra;

import io.github.erfangc.raincove.finser.models.FinancialStatement;
import org.springframework.data.cassandra.repository.MapIdCassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FinancialStatementRepository extends MapIdCassandraRepository<FinancialStatement> {
    List<FinancialStatement> findAllByCompanyId(String companyId);
}
