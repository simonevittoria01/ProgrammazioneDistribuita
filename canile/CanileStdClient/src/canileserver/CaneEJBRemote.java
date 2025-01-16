package canileserver;

import jakarta.ejb.Remote;
import java.util.List;

@Remote
public interface CaneEJBRemote { 
    void inserisci(Cane c);
    void elimina(Cane c);
    void aggiorna(Cane c);
    
    Cane trovaPerId(int id);
    List<Cane> trovaPerRazza(String razza);
    List<Cane> trovaPerNome(String nome);
    List<Cane> trovaPerTaglia(String taglia);
    List<Cane> trovaPerEta(String eta);
    List<Cane> trovaPerStato(boolean stato);
    List<Cane> trovaTutto();
    List<Cane> trovaPerTagliaEeta(String taglia, String eta);
    boolean adotta(int id);
}
