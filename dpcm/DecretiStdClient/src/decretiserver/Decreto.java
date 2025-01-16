package decretiserver;

import static decretiserver.Decreto.TROVA_PER_CATEGORIA;
import static decretiserver.Decreto.TROVA_PER_EMERGENZA;
import static decretiserver.Decreto.TROVA_PER_ID;
import static decretiserver.Decreto.TROVA_PER_PRESENTAZIONI;
import static decretiserver.Decreto.TROVA_TUTTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import java.io.Serializable;

@Entity
@NamedQueries({
    @NamedQuery(name = TROVA_PER_ID, query = "SELECT d FROM Decreto d WHERE d.id = :id"),
    @NamedQuery(name = TROVA_PER_EMERGENZA, query = "SELECT d FROM Decreto d WHERE d.emergenza = :emergenza"),
    @NamedQuery(name = TROVA_TUTTO, query = "SELECT d FROM Decreto d"),
    @NamedQuery(name = TROVA_PER_CATEGORIA, query = "SELECT d FROM Decreto d WHERE d.tipoEmergenza = :tipoEmergenza"),
    @NamedQuery(name = TROVA_PER_PRESENTAZIONI, query = "SELECT d FROM Decreto d WHERE d.numeroPresentazioni > :numeroPresentazioni")
})
public class Decreto implements Serializable {

    private static final long serialVersionUID = 1L;
    
    public static final String TROVA_PER_ID = "Decreto.trovaPerId";
    public static final String TROVA_PER_EMERGENZA = "Decreto.trovaPerEmergenza";
    public static final String TROVA_TUTTO = "Decreto.trovaTutto";
    public static final String TROVA_PER_CATEGORIA = "Decreto.trovaPerCategoria";
    public static final String TROVA_PER_PRESENTAZIONI = "Decreto.trovaPerPresentazioni";

    
    @Id
    private int id;
    private String nome;
    private String emergenza;
    private String tipoEmergenza;
    private int livelloLockdown;
    private int numeroPresentazioni;

    public Decreto() {
    }

    public Decreto(int id, String nome, String emergenza, String tipoEmergenza, int livelloLockdown, int numeroPresentazioni) {
        this.id = id;
        this.nome = nome;
        this.emergenza = emergenza;
        this.tipoEmergenza = tipoEmergenza;
        this.livelloLockdown = livelloLockdown;
        this.numeroPresentazioni = numeroPresentazioni;
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

    public String getEmergenza() {
        return emergenza;
    }

    public void setEmergenza(String emergenza) {
        this.emergenza = emergenza;
    }

    public String getTipoEmergenza() {
        return tipoEmergenza;
    }

    public void setTipoEmergenza(String tipoEmergenza) {
        this.tipoEmergenza = tipoEmergenza;
    }

    public int getLivelloLockdown() {
        return livelloLockdown;
    }

    public void setLivelloLockdown(int livelloLockdown) {
        this.livelloLockdown = livelloLockdown;
    }

    public int getNumeroPresentazioni() {
        return numeroPresentazioni;
    }

    public void setNumeroPresentazioni(int numeroPresentazioni) {
        this.numeroPresentazioni = numeroPresentazioni;
    }

    @Override
    public String toString() {
        return "Decreti{" + "id=" + id + ", nome=" + nome + ", emergenza=" + emergenza + ", tipoEmergenza=" + tipoEmergenza + ", livelloLockdown=" + livelloLockdown + ", numeroPresentazioni=" + numeroPresentazioni + '}';
    }
}
