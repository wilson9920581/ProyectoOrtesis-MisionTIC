package orthesis.orthesis.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import orthesis.orthesis.models.Admin;

import java.util.List;
// el Repository es para hacer operaciones con la base de datos
public interface AdminCrudRepository extends CrudRepository<Admin, Integer> {
   // @Query("SELECT c.name, COUNT(c.name) FROM Admin AS c group by c.name order by count(c.name) desc")
    //public List<Object[]> countTotalAdminByModel();
}
