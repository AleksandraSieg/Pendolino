package pl.madison.dao;

import org.springframework.data.repository.CrudRepository;
import pl.madison.domain.Pendolino;

public interface PendolinoDao extends CrudRepository<Pendolino, Long> {
}
