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
    private Integer idClient;
    private String name;
    private String email;
    private Integer age; //falta messages?

    //Relations:
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy ="client" )
    @JsonIgnoreProperties("client")
    private List<Reservation> reservations;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy ="client" )
    @JsonIgnoreProperties("client")
    private List<Message> messages;

    //Metodos Setter y Getter

    public Integer getIdClient() {
        return idClient;
    }

    public Client setIdClient(Integer idClient) {
        this.idClient = idClient;
        return this;
    }

    public String getName() {
        return name;
    }

    public Client setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Client setEmail(String email) {
        this.email = email;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Client setAge(Integer age) {
        this.age = age;
        return this;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public Client setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
        return this;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public Client setMessages(List<Message> messages) {
        this.messages = messages;
        return this;
    }
}
