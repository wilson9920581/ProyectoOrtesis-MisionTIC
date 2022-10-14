package orthesis.orthesis.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "ortesis")
public class Ortesis implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Attributes
    private Integer id;
    private String brand;
    private String name;
    private Integer model;
    private Integer category_id;

    //Relations:
    @ManyToOne
    @JoinColumn(name = "categoryId")
    @JsonIgnoreProperties("ortesis")
    private Category category;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "ortesis") //Error
    @JsonIgnoreProperties({"ortesis","client"})
    private List<Message> messages;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "ortesis")
    @JsonIgnoreProperties({"ortesis","messages"})
    private List<Reservation> reservations;

    //metodos setter y getter

    public Integer getId() {
        return id;
    }

    public Ortesis setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public Ortesis setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getName() {
        return name;
    }

    public Ortesis setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getModel() {
        return model;
    }

    public Ortesis setModel(Integer model) {
        this.model = model;
        return this;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public Ortesis setCategory_id(Integer category_id) {
        this.category_id = category_id;
        return this;
    }

    public Category getCategory() {
        return category;
    }

    public Ortesis setCategory(Category category) {
        this.category = category;
        return this;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public Ortesis setMessages(List<Message> messages) {
        this.messages = messages;
        return this;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public Ortesis setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
        return this;
    }
}
