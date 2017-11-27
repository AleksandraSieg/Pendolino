package pl.madison.dao;

import org.springframework.data.repository.CrudRepository;
import pl.madison.domain.Pociag;

public interface PociagDao extends CrudRepository<Pociag, Long> {
}
