package ch.zhaw.infm.springboottemplate.repositories;

import ch.zhaw.infm.springboottemplate.entities.Shows;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowsRepository extends JpaRepository<Shows, Long> {
    @Query(value = "SELECT x.shows_id AS lhs, y.shows_id as rhs FROM Shows x INNER JOIN Shows y WHERE x.shows_id < y.shows_id", nativeQuery = true)
    List<Object[]> findEdges();
}
