package orthesis.orthesis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import orthesis.orthesis.models.Admin;
import orthesis.orthesis.repository.AdminRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    //es necesario que vayan estas lineas de codigo?
    public List<Admin> getAll(){return adminRepository.getAll();}

    public Optional<Admin> getAdmin(int id){
        return adminRepository.getAdmin(id);
    }

    public Admin save(Admin admin){
        if (admin.getIdAdmin() == null){
            return adminRepository.save(admin);
        }else {
            return admin;
        }
    }
}
