package orthesis.orthesis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import orthesis.orthesis.models.Ortesis;
import orthesis.orthesis.repository.OrtesisRepository;

import java.util.List;

@Service
public class OrtesisService {

    @Autowired
    private OrtesisRepository ortesisRepository;  //inyeccion de dependencias

    public List<Ortesis> getAll(){
        return ortesisRepository.getAll();
    }

    public Ortesis save(Ortesis ortesis){
        if (ortesis.getId() == null){
            return ortesisRepository.save(ortesis);
        }else {
            return ortesis;
        }
    }
}
