package immobileserver;

import static immobileserver.Immobile.TROVA_PER_DATA_VENDITA;
import static immobileserver.Immobile.TROVA_PER_ID;
import static immobileserver.Immobile.TROVA_PER_INDIRIZZO;
import static immobileserver.Immobile.TROVA_PER_STATO;
import static immobileserver.Immobile.TROVA_TUTTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@NamedQueries({
    @NamedQuery(name = TROVA_PER_INDIRIZZO, query = "SELECT i FROM Immobile i WHERE i.indirizzo = :indirizzo"),
    @NamedQuery(name = TROVA_TUTTO, query = "SELECT i FROM Immobile i"),
    @NamedQuery(name = TROVA_PER_STATO, query = "SELECT i FROM Immobile i WHERE i.stato = :stato"),
    @NamedQuery(name = TROVA_PER_DATA_VENDITA, query = "SELECT i FROM Immobile i WHERE i.ultimaModifica >= :data"),
    @NamedQuery(name = TROVA_PER_ID, query = "SELECT i FROM Immobile i WHERE i.id = :id")
})
@XmlRootElement
public class Immobile implements Serializable {

    private static final long serialVersionUID = 1L;
    
    public static final String TROVA_PER_INDIRIZZO = "Immobile.trovaPerIndirizzo;";
    public static final String TROVA_TUTTO = "Immobile.trovaTutto;";
    public static final String TROVA_PER_STATO = "Immobile.trovaPerStato;";
    public static final String TROVA_PER_DATA_VENDITA = "Immobile.trovaPerDataVendita;";
    public static final String TROVA_PER_ID = "Immobile.trovaPerId;";

    
    @Id
    private int id;
    private String indirizzo;
    private int valore;
    private LocalDate ultimaModifica;
    private LocalDate caricamentoDati;
    private String stato;

    public Immobile() {
    }

    public Immobile(int id, String indirizzo, int valore, LocalDate ultimaModifica, LocalDate caricamentoDati, String stato) {
        this.id = id;
        this.indirizzo = indirizzo;
        this.valore = valore;
        this.ultimaModifica = ultimaModifica;
        this.caricamentoDati = caricamentoDati;
        this.stato = stato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public int getValore() {
        return valore;
    }

    public void setValore(int valore) {
        this.valore = valore;
    }

    public LocalDate getUltimaModifica() {
        return ultimaModifica;
    }

    public void setUltimaModifica(LocalDate ultimaModifica) {
        this.ultimaModifica = ultimaModifica;
    }

    public LocalDate getCaricamentoDati() {
        return caricamentoDati;
    }

    public void setCaricamentoDati(LocalDate caricamentoDati) {
        this.caricamentoDati = caricamentoDati;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Immobile{" + "id=" + id + ", indirizzo=" + indirizzo + ", valore=" + valore + ", ultimaModifica=" + ultimaModifica + ", caricamentoDati=" + caricamentoDati + ", stato=" + stato + '}';
    }  
}
