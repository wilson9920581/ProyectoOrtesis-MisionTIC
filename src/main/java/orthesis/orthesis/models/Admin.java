package orthesis.orthesis.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "admin")
public class Admin implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //Attributes:
    private Integer idAdmin;
    private String name;
    private String email;
    private String password;

    //Metodos Setter y Getter


    public Integer getIdAdmin() {
        return idAdmin;
    }

    public Admin setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
        return this;
    }

    public String getName() {
        return name;
    }

    public Admin setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Admin setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Admin setPassword(String password) {
        this.password = password;
        return this;
    }
}
