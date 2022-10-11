package orthesis.orthesis.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import orthesis.orthesis.models.Category;

public interface CategoryCrudRepository extends CrudRepository<Category, Integer> {

}
