package net.frey.jpatest.repository;

import net.frey.jpatest.entity.Problemz;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProblemzRepository extends CrudRepository<Problemz, UUID> {
    List<Problemz> findAllByOrderByCreationTimestampDesc();
}
