package orthesis.orthesis.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import net.bytebuddy.dynamic.loading.ClassReloadingStrategy;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.hibernate.annotations.Cascade;
import org.springframework.boot.autoconfigure.web.WebProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "client")
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Attributes
    private Integer id;
    private String name;
    private String email;
    private Integer age;

    //Relations:
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy ="client" )
    @JsonIgnoreProperties("client")
    private List<Reservation> reservation;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy ="client" )
    @JsonIgnoreProperties("client")
    private List<Message> message;  //error

    //metodos setter y getter:

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
