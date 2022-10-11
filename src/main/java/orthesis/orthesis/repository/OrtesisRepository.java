package orthesis.orthesis.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import orthesis.orthesis.models.Ortesis;

import java.util.List;
import java.util.Optional;

@Repository
public class OrtesisRepository {
    @Autowired
    private OrtesisCrudRepository ortesisCrudRepository; //estamos haciendo la instancia

    //get
    public List<Ortesis> getAll() {
        return (List<Ortesis>) ortesisCrudRepository.findAll();
    }

    public Optional<Ortesis> getOrtesis(int id){
        return ortesisCrudRepository.findById(id);
    }

    //post
    public Ortesis save(Ortesis ortesis){
        return ortesisCrudRepository.save(ortesis);
    }

}
