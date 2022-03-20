package pl.adamd.crmsrv.offer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.adamd.crmsrv.offer.entity.Execution;

@Repository
public interface ExecutionRepository extends JpaRepository<Execution, Long> {
}
