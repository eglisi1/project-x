package ch.zhaw.infm.springboottemplate.repositories;

import ch.zhaw.infm.springboottemplate.entities.Trick;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrickRepository extends JpaRepository<Trick, Long> {
}
