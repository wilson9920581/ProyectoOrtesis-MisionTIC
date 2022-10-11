package orthesis.orthesis.repository;

import org.springframework.data.repository.CrudRepository;
import orthesis.orthesis.models.Reservation;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {

}
