package orthesis.orthesis.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "reservation")
public class Reservation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Attributes
    private Integer idReservation;
    private Date StartDate;
    private Date devolutionDate;
    private String Status_Code="created";

    //Relations:
    @ManyToOne
    @JoinColumn(name = "Id")
    @JsonIgnoreProperties("reservations")
    private Ortesis ortesis;

    @ManyToOne
    @JoinColumn(name = "clientId")
    @JsonIgnoreProperties({"reservations","messages"})
    private Client client;

    @OneToOne(cascade = {CascadeType.REMOVE}, mappedBy = "reservation")
    @JsonIgnoreProperties("reservation")
    private Score score;

    //metodos Getter y Setter:


    public Integer getIdReservation() {
        return idReservation;
    }

    public Reservation setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
        return this;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public Reservation setStartDate(Date startDate) {
        StartDate = startDate;
        return this;
    }

    public Date getDevolutionDate() {
        return devolutionDate;
    }

    public Reservation setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
        return this;
    }

    public String getStatus_Code() {
        return Status_Code;
    }

    public Reservation setStatus_Code(String status_Code) {
        Status_Code = status_Code;
        return this;
    }

    public Ortesis getOrtesis() {
        return ortesis;
    }

    public Reservation setOrtesis(Ortesis ortesis) {
        this.ortesis = ortesis;
        return this;
    }

    public Client getClient() {
        return client;
    }

    public Reservation setClient(Client client) {
        this.client = client;
        return this;
    }

    public Score getScore() {
        return score;
    }

    public Reservation setScore(Score score) {
        this.score = score;
        return this;
    }
}
