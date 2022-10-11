package orthesis.orthesis.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.awt.*;
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

    //Relations:
    @ManyToOne
    @JoinColumn(name = "categoryId")
    @JsonIgnoreProperties("ortesis")
    private Category category;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "ortesis") //Error
    @JsonIgnoreProperties("ortesis")
    private List<Message> message;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "ortesis")
    @JsonIgnoreProperties("ortesis")
    private List<Reservation> reservation;

    //metodos setter y getter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
