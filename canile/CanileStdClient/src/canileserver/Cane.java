package canileserver;

import static canileserver.Cane.TROVA_PER_ETA;
import static canileserver.Cane.TROVA_PER_ID;
import static canileserver.Cane.TROVA_PER_NOME;
import static canileserver.Cane.TROVA_PER_RAZZA;
import static canileserver.Cane.TROVA_PER_STATO;
import static canileserver.Cane.TROVA_PER_TAGLIA;
import static canileserver.Cane.TROVA_PER_TAGLIA_E_ETA;
import static canileserver.Cane.TROVA_TUTTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Entity
@NamedQueries({
    @NamedQuery(name = TROVA_PER_ID, query = "SELECT c FROM Cane c WHERE c.id = :id"),
    @NamedQuery(name = TROVA_PER_RAZZA, query = "SELECT c FROM Cane c WHERE c.razza = :razza"),
    @NamedQuery(name = TROVA_PER_NOME, query = "SELECT c FROM Cane c WHERE c.nome = :nome"),
    @NamedQuery(name = TROVA_PER_TAGLIA, query = "SELECT c FROM Cane c WHERE c.taglia = :taglia"),
    @NamedQuery(name = TROVA_PER_ETA, query = "SELECT c FROM Cane c WHERE c.eta = :eta"),
    @NamedQuery(name = TROVA_PER_STATO, query = "SELECT c FROM Cane c WHERE c.stato = :stato"),
    @NamedQuery(name = TROVA_TUTTO, query = "SELECT c FROM Cane c"),
    @NamedQuery(name = TROVA_PER_TAGLIA_E_ETA, query = "SELECT c FROM Cane c WHERE c.taglia = :taglia AND c.eta = :eta")
})
@XmlRootElement
public class Cane implements Serializable {

    private static final long serialVersionUID = 1L;
    
    public static final String TROVA_PER_ID = "Cane.trovaPerId";
    public static final String TROVA_PER_RAZZA = "Cane.trovaPerRazza";
    public static final String TROVA_PER_NOME = "Cane.trovaPerNome";
    public static final String TROVA_PER_TAGLIA = "Cane.trovaPerTaglia";
    public static final String TROVA_PER_ETA = "Cane.trovaPerEta";
    public static final String TROVA_PER_STATO = "Cane.trovaPerStato";
    public static final String TROVA_TUTTO = "Cane.trovaPerTutto";
    public static final String TROVA_PER_TAGLIA_E_ETA = "Cane.trovaPerTagliaEeta";

    @Id
    private int id;
    private String razza;
    private String nome;
    private String taglia;
    private String sesso;
    private String eta;
    private String chip;
    private boolean stato;

    public Cane() {
    }

    public Cane(int id, String razza, String nome, String taglia, String sesso, String eta, String chip, boolean stato) {
        this.id = id;
        this.razza = razza;
        this.nome = nome;
        this.taglia = taglia;
        this.sesso = sesso;
        this.eta = eta;
        this.chip = chip;
        this.stato = stato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRazza() {
        return razza;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTaglia() {
        return taglia;
    }

    public void setTaglia(String taglia) {
        this.taglia = taglia;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public boolean isStato() {
        return stato;
    }

    public void setStato(boolean stato) {
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Cane{" + "id=" + id + ", razza=" + razza + ", nome=" + nome + ", taglia=" + taglia + ", sesso=" + sesso + ", eta=" + eta + ", chip=" + chip + ", stato=" + stato + '}';
    }
}
