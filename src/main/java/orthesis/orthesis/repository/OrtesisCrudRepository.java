package orthesis.orthesis.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import orthesis.orthesis.models.Ortesis;

import java.util.List;

//El Repositorio es para hacer operaciones con la base de datos
public interface OrtesisCrudRepository extends CrudRepository<Ortesis, Integer> {

    @Query("SELECT c.model, COUNT(c.model) FROM Ortesis AS c group by c.model order by count(c.model) desc") //crear consulta
    public List<Object[]> countTotalOrtesisByModel();

}
