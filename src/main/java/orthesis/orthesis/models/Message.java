package orthesis.orthesis.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "message")
public class Message implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Attributes
    private Integer idMessage;
    private String messagetext;

    //Relations
    @ManyToOne
    @JoinColumn(name ="ortesisId")
    @JsonIgnoreProperties("message")
    private Ortesis ortesis;

    @ManyToOne
    @JoinColumn(name = "clientId")
    @JsonIgnoreProperties("message")
    private Client client;


    //Metodos Getter y Setter:

    public Integer getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }

    public String getMessagetext() {
        return messagetext;
    }

    public void setMessagetext(String messagetext) {
        this.messagetext = messagetext;
    }

    //Metodos set y Get Foreign Keys.
    public Ortesis getOrtesis() {
        return ortesis;
    }

    public void setOrtesis(Ortesis ortesis) {
        this.ortesis = ortesis;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
