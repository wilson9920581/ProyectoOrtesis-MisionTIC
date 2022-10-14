package orthesis.orthesis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import orthesis.orthesis.models.Ortesis;
import orthesis.orthesis.repository.OrtesisRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OrtesisService {

    @Autowired
    private OrtesisRepository ortesisRepository;  //inyeccion de dependencias

    public List<Ortesis> getAll(){
        return ortesisRepository.getAll();
    }

    public Optional<Ortesis> getOrtesis(int id){
        return ortesisRepository.getOrtesis(id);
    }

    public Ortesis save(Ortesis ortesis){
        if (ortesis.getId() == null){
            return ortesisRepository.save(ortesis);
        }else {
            Optional<Ortesis> orthesis1 = ortesisRepository.getOrtesis(ortesis.getId());
            if (orthesis1.isEmpty()) {
                return ortesisRepository.save(ortesis);
            } else {
                return ortesis;
            }
        }
    }
}
