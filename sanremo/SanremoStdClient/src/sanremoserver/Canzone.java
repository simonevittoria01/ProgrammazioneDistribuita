package sanremoserver;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import static sanremoserver.Canzone.TROVA_PER_CATEGORIA;
import static sanremoserver.Canzone.TROVA_PER_ID;
import static sanremoserver.Canzone.TROVA_PER_VOTI;
import static sanremoserver.Canzone.TROVA_TUTTO;

@Entity
@NamedQueries({
    @NamedQuery(name = TROVA_PER_ID, query = "SELECT c FROM Canzone c WHERE c.id = :id"),
    @NamedQuery(name = TROVA_PER_CATEGORIA, query = "SELECT c FROM Canzone c WHERE c.categoria = :categoria"),
    @NamedQuery(name = TROVA_TUTTO, query = "SELECT c FROM Canzone c"),
    @NamedQuery(name = TROVA_PER_VOTI, query = "SELECT c FROM Canzone c WHERE c.voti > :voti")
})
@XmlRootElement
public class Canzone implements Serializable {

    private static final long serialVersionUID = 1L;
    
    public static final String TROVA_PER_ID = "Canzone.trovaPerId";
    public static final String TROVA_PER_CATEGORIA = "Canzone.trovaPerCategoria";
    public static final String TROVA_TUTTO = "Canzone.trovaTutto";
    public static final String TROVA_PER_VOTI = "Canzone.trovaPerVoti";

    @Id
    private int id;
    private String nome;
    private String categoria;
    //primi versi del testo
    private String incipit;
    private boolean cantato;
    private int voti;

    public Canzone() {
    }

    public Canzone(int id, String nome, String categoria, String incipit, boolean cantato, int voti) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.incipit = incipit;
        this.cantato = cantato;
        this.voti = voti;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getIncipit() {
        return incipit;
    }

    public void setIncipit(String incipit) {
        this.incipit = incipit;
    }

    public boolean isCantato() {
        return cantato;
    }

    public void setCantato(boolean cantato) {
        this.cantato = cantato;
    }

    public int getVoti() {
        return voti;
    }

    public void setVoti(int voti) {
        this.voti = voti;
    }

    @Override
    public String toString() {
        return "Canzone{" + "id=" + id + ", nome=" + nome + ", categoria=" + categoria + ", incipit=" + incipit + ", cantato=" + cantato + ", voti=" + voti + '}';
    }
}
