package orthesis.orthesis.repository;

import org.springframework.data.repository.CrudRepository;
import orthesis.orthesis.models.Message;

public interface MessageCrudRepository extends CrudRepository<Message, Integer>{

}
