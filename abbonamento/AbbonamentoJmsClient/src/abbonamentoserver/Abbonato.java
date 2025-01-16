package abbonamentoserver;

import static abbonamentoserver.Abbonato.TROVA_PER_ID;
import static abbonamentoserver.Abbonato.TROVA_PER_SCADENZA;
import static abbonamentoserver.Abbonato.TROVA_PER_STATO;
import static abbonamentoserver.Abbonato.TROVA_PER_TIPO;
import static abbonamentoserver.Abbonato.TROVA_TUTTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@NamedQueries({
    @NamedQuery(name = TROVA_PER_STATO, query = "SELECT a FROM Abbonato a WHERE a.statoAbbonamento = :stato"),
    @NamedQuery(name = TROVA_TUTTO, query = "SELECT a FROM Abbonato a"),
    @NamedQuery(name = TROVA_PER_SCADENZA, query = "SELECT a FROM Abbonato a WHERE a.dataScadenza > :data"),
    @NamedQuery(name = TROVA_PER_TIPO, query = "SELECT a FROM Abbonato a WHERE a.statoAbbonamento = :stato AND a.dataScadenza > :data AND a.tipoAbbonamento = :tipo"),
    @NamedQuery(name = TROVA_PER_ID, query = "SELECT a FROM Abbonato a WHERE a.id = :id")
})
@XmlRootElement
public class Abbonato implements Serializable {

    @Id
    private int id;
    private String nome;
    private String cognome;
    private String tipoAbbonamento;
    private LocalDate dataScadenza;
    private LocalDate dataCaricamentoDati;
    private String statoAbbonamento;
    
    public static final String TROVA_PER_STATO = "Abbonato.trovaPerStato";
    public static final String TROVA_TUTTO = "Abbonato.trovaTutto";
    public static final String TROVA_PER_SCADENZA = "Abbonato.trovaPerScadenza";
    public static final String TROVA_PER_TIPO = "Abbonato.trovaPerTipo";
    public static final String TROVA_PER_ID = "Abbonato.trovaPerId";

    public Abbonato() {
    }

    public Abbonato(int id, String nome, String cognome, String tipoAbbonamento, LocalDate dataScadenza, LocalDate dataCaricamentoDati, String statoAbbonamento) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.tipoAbbonamento = tipoAbbonamento;
        this.dataScadenza = dataScadenza;
        this.dataCaricamentoDati = dataCaricamentoDati;
        this.statoAbbonamento = statoAbbonamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getTipoAbbonamento() {
        return tipoAbbonamento;
    }

    public void setTipoAbbonamento(String tipoAbbonamento) {
        this.tipoAbbonamento = tipoAbbonamento;
    }

    public LocalDate getDataScadenza() {
        return dataScadenza;
    }

    public void setDataScadenza(LocalDate dataScadenza) {
        this.dataScadenza = dataScadenza;
    }

    public LocalDate getDataCaricamentoDati() {
        return dataCaricamentoDati;
    }

    public void setDataCaricamentoDati(LocalDate dataCaricamentoDati) {
        this.dataCaricamentoDati = dataCaricamentoDati;
    }

    public String getStatoAbbonamento() {
        return statoAbbonamento;
    }

    public void setStatoAbbonamento(String statoAbbonamento) {
        this.statoAbbonamento = statoAbbonamento;
    }

    @Override
    public String toString() {
        return "Abbonato{" + "id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", tipoAbbonamento=" + tipoAbbonamento + ", dataScadenza=" + dataScadenza + ", dataCaricamentoDati=" + dataCaricamentoDati + ", statoAbbonamento=" + statoAbbonamento + '}';
    }
}
