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
    private Integer idReservations;
    private Date StartDate;
    private Date devolutionDate;
    private String Status_Code="created";

    //Relations:
    @ManyToOne
    @JoinColumn(name = "ortesisId")
    @JsonIgnoreProperties("reservation")
    private Ortesis ortesis;

    @ManyToOne
    @JoinColumn(name = "clientId")
    @JsonIgnoreProperties("reservation")
    private Client client;

    @OneToOne(cascade = {CascadeType.REMOVE}, mappedBy = "reservation")
    @JsonIgnoreProperties("reservation")
    private Score score;

    //metodos Getter y Setter:

    public Integer getIdReservations() {
        return idReservations;
    }

    public void setIdReservations(Integer idReservations) {
        this.idReservations = idReservations;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public Date getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public String getStatus_Code() {
        return Status_Code;
    }

    public void setStatus_Code(String status_Code) {
        Status_Code = status_Code;
    }
}
