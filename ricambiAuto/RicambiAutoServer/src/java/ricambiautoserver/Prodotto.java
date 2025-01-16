package ricambiautoserver;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import static ricambiautoserver.Prodotto.TROVA_DA_ORDINARE;
import static ricambiautoserver.Prodotto.TROVA_PER_CATEGORIA;
import static ricambiautoserver.Prodotto.TROVA_PER_ID;
import static ricambiautoserver.Prodotto.TROVA_TUTTI;

@Entity
@NamedQueries({
    @NamedQuery(name = TROVA_PER_ID, query = "SELECT p FROM Prodotto p WHERE p.id = :id"),
    @NamedQuery(name = TROVA_PER_CATEGORIA, query = "SELECT p FROM Prodotto p WHERE p.categoria = :categoria"),
    @NamedQuery(name = TROVA_TUTTI, query = "SELECT p FROM Prodotto p WHERE p.disponibilita > 0"),
    @NamedQuery(name = TROVA_DA_ORDINARE, query = "SELECT p FROM Prodotto p WHERE p.disponibilita < 10")
})
@XmlRootElement
public class Prodotto implements Serializable {

    private static final long serialVersionUID = 1L;
    
    public static final String TROVA_PER_ID = "Prodotto.trovaPerId";
    public static final String TROVA_PER_CATEGORIA = "Prodotto.trovaPerCategoria";
    public static final String TROVA_TUTTI = "Prodotto.trovaTutti";
    public static final String TROVA_DA_ORDINARE = "Prodotto.trovaDaOrdinare";

    @Id
    private int id;
    private String nome;
    private String categoria;
    private double prezzo;
    private int disponibilita;
    private int venduti;

    public Prodotto() {
    }

    public Prodotto(int id, String nome, String categoria, double prezzo, int disponibilita, int venduti) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.prezzo = prezzo;
        this.disponibilita = disponibilita;
        this.venduti = venduti;
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

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getDisponibilita() {
        return disponibilita;
    }

    public void setDisponibilita(int disponibilita) {
        this.disponibilita = disponibilita;
    }

    public int getVenduti() {
        return venduti;
    }

    public void setVenduti(int venduti) {
        this.venduti = venduti;
    }

    @Override
    public String toString() {
        return "Prodotto{" + "id=" + id + ", nome=" + nome + ", categoria=" + categoria + ", prezzo=" + prezzo + ", disponibilita=" + disponibilita + ", venduti=" + venduti + '}';
    }
}
