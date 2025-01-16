package partiteserver;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import static partiteserver.Partita.TROVA_PER_GOAL;
import static partiteserver.Partita.TROVA_PER_ID;
import static partiteserver.Partita.TROVA_PER_NUM_AMMONIZIONI;
import static partiteserver.Partita.TROVA_PER_NUM_ESPULSIONI;
import static partiteserver.Partita.TROVA_PER_PARTITE_GIOCATE;
import static partiteserver.Partita.TROVA_PER_TIPO;
import static partiteserver.Partita.TROVA_TUTTO;

@Entity
@NamedQueries({
    @NamedQuery(name = TROVA_PER_TIPO, query = "SELECT p FROM Partita p WHERE p.tipo = :tipo"),
    @NamedQuery(name = TROVA_PER_NUM_AMMONIZIONI, query = "SELECT p FROM Partita p WHERE p.numAmmonizioni = :numAmmonizioni"),
    @NamedQuery(name = TROVA_PER_NUM_ESPULSIONI, query = "SELECT p FROM Partita p WHERE p.numEspulsioni = :numEspulsioni"),
    @NamedQuery(name = TROVA_TUTTO, query = "SELECT p FROM Partita p"),
    @NamedQuery(name = TROVA_PER_GOAL, query = "SELECT p FROM Partita p WHERE (p.goalCasa + p.goalOspite) > :goalTotali"),
    @NamedQuery(name = TROVA_PER_ID, query = "SELECT p FROM Partita p WHERE p.id = :id"),
    @NamedQuery(name = TROVA_PER_PARTITE_GIOCATE, query = "SELECT p FROM Partita p WHERE p.giocata = :giocata")
})
@XmlRootElement
public class Partita implements Serializable {

    private static final long serialVersionUID = 1L;
    
    public static final String TROVA_PER_TIPO = "Partita.trovaPerTipo";
    public static final String TROVA_PER_NUM_AMMONIZIONI = "Partita.trovaPerNumAmmonizioni";
    public static final String TROVA_PER_NUM_ESPULSIONI = "Partita.trovaPerNumEspulsioni";
    public static final String TROVA_TUTTO = "Partita.trovaTutto";
    public static final String TROVA_PER_GOAL = "Partita.trovaPerGoal";
    public static final String TROVA_PER_ID = "Partita.trovaPerId";
    public static final String TROVA_PER_PARTITE_GIOCATE = "Partita.trovaPerPartiteGiocate";
    
    @Id
    private int id;
    private String tipo;
    private String squadraCasa;
    private String squadraOspite;
    private int goalCasa;
    private int goalOspite;
    private int numAmmonizioni;
    private int numEspulsioni;
    private boolean giocata;

    public Partita() {
    }

    public Partita(int id, String tipo, String squadraCasa, String squadraOspite, int goalCasa, int goalOspite, int numAmmonizioni, int numEspulsioni, boolean giocata) {
        this.id = id;
        this.tipo = tipo;
        this.squadraCasa = squadraCasa;
        this.squadraOspite = squadraOspite;
        this.goalCasa = goalCasa;
        this.goalOspite = goalOspite;
        this.numAmmonizioni = numAmmonizioni;
        this.numEspulsioni = numEspulsioni;
        this.giocata = giocata;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSquadraCasa() {
        return squadraCasa;
    }

    public void setSquadraCasa(String squadraCasa) {
        this.squadraCasa = squadraCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public void setSquadraOspite(String squadraOspite) {
        this.squadraOspite = squadraOspite;
    }

    public int getGoalCasa() {
        return goalCasa;
    }

    public void setGoalCasa(int goalCasa) {
        this.goalCasa = goalCasa;
    }

    public int getGoalOspite() {
        return goalOspite;
    }

    public void setGoalOspite(int goalOspite) {
        this.goalOspite = goalOspite;
    }

    public int getNumAmmonizioni() {
        return numAmmonizioni;
    }

    public void setNumAmmonizioni(int numAmmonizioni) {
        this.numAmmonizioni = numAmmonizioni;
    }

    public int getNumEspulsioni() {
        return numEspulsioni;
    }

    public void setNumEspulsioni(int numEspulsioni) {
        this.numEspulsioni = numEspulsioni;
    }

    public boolean isGiocata() {
        return giocata;
    }

    public void setGiocata(boolean giocata) {
        this.giocata = giocata;
    }

    @Override
    public String toString() {
        return "Partite{" + "id=" + id + ", tipo=" + tipo + ", squadraCasa=" + squadraCasa + ", squadraOspite=" + squadraOspite + ", goalCasa=" + goalCasa + ", goalOspite=" + goalOspite + ", numAmmonizioni=" + numAmmonizioni + ", numEspulsioni=" + numEspulsioni + ", giocata=" + giocata + '}';
    } 
}
