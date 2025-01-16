package abitanteserver;

import static abitanteserver.Abitante.TROVA_PER_CATEGORIA;
import static abitanteserver.Abitante.TROVA_PER_CATEGORIA_E_ETA;
import static abitanteserver.Abitante.TROVA_PER_CATEGORIA_E_INTERESSE_VACCINO;
import static abitanteserver.Abitante.TROVA_PER_CONTRATTO_COVID;
import static abitanteserver.Abitante.TROVA_PER_ETA;
import static abitanteserver.Abitante.TROVA_PER_ID;
import static abitanteserver.Abitante.TROVA_TUTTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Entity
@NamedQueries({
    @NamedQuery(name = TROVA_PER_CATEGORIA, query = "SELECT a FROM Abitante a WHERE a.categoria = :categoria"),
    @NamedQuery(name = TROVA_PER_CONTRATTO_COVID, query = "SELECT a FROM Abitante a WHERE a.contrattoCovid = :contrattoCovid"),
    @NamedQuery(name = TROVA_PER_ETA, query = "SELECT a FROM Abitante a WHERE a.eta = :eta"),
    @NamedQuery(name = TROVA_TUTTO, query = "SELECT a FROM Abitante a"),
    @NamedQuery(name = TROVA_PER_CATEGORIA_E_ETA, query = "SELECT a FROM Abitante a WHERE a.categoria = :categoria AND a.eta < :eta"),
    @NamedQuery(name = TROVA_PER_CATEGORIA_E_INTERESSE_VACCINO, query = "SELECT a FROM Abitante a WHERE a.categoria = :categoria AND a.interesseVaccino = :interesseVaccino"),
    @NamedQuery(name = TROVA_PER_ID, query = "SELECT a FROM Abitante a WHERE a.id = :id")
})
@XmlRootElement
public class Abitante implements Serializable {
    
    public static final String TROVA_PER_CATEGORIA = "Abitante.trovaPerCategoria";
    public static final String TROVA_PER_CONTRATTO_COVID = "Abitante.trovaPerContrattoCovid";
    public static final String TROVA_PER_ETA = "Abitante.trovaPerEta";
    public static final String TROVA_TUTTO = "Abitante.trovaTutto";
    public static final String TROVA_PER_CATEGORIA_E_ETA = "Abitante.trovaPerCategoriaEeta";
    public static final String TROVA_PER_CATEGORIA_E_INTERESSE_VACCINO = "Abitante.trovaPerCategoriaEinteresseVaccino";
    public static final String TROVA_PER_ID = "Abitante.trovaPerId";

    @Id
    private int id;
    private String nome;
    private String cognome;
    private String categoria;
    private int eta;
    private String genere;
    private int numMalattiePregresse;
    private boolean contrattoCovid;
    private String interesseVaccino;
    private String priorita;

    public Abitante() {
    }

    public Abitante(int id, String nome, String cognome, String categoria, int eta, String genere, int numMalattiePregresse, boolean contrattoCovid, String interesseVaccino, String priorita) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.categoria = categoria;
        this.eta = eta;
        this.genere = genere;
        this.numMalattiePregresse = numMalattiePregresse;
        this.contrattoCovid = contrattoCovid;
        this.interesseVaccino = interesseVaccino;
        this.priorita = priorita;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public int getNumMalattiePregresse() {
        return numMalattiePregresse;
    }

    public void setNumMalattiePregresse(int numMalattiePregresse) {
        this.numMalattiePregresse = numMalattiePregresse;
    }

    public boolean isContrattoCovid() {
        return contrattoCovid;
    }

    public void setContrattoCovid(boolean contrattoCovid) {
        this.contrattoCovid = contrattoCovid;
    }

    public String getInteresseVaccino() {
        return interesseVaccino;
    }

    public void setInteresseVaccino(String interesseVaccino) {
        this.interesseVaccino = interesseVaccino;
    }

    public String getPriorita() {
        return priorita;
    }

    public void setPriorita(String priorita) {
        this.priorita = priorita;
    }

    @Override
    public String toString() {
        return "Abitante{" + "id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", categoria=" + categoria + ", eta=" + eta + ", genere=" + genere + ", numMalattiePregresse=" + numMalattiePregresse + ", contrattoCovid=" + contrattoCovid + ", interesseVaccino=" + interesseVaccino + ", priorita=" + priorita + '}';
    }
}
