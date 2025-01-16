package immobileserver;

import jakarta.ejb.Remote;
import java.time.LocalDate;
import java.util.List;

@Remote
public interface ImmobileEJBRemote {   
    void inserisci(Immobile i);
    void elimina(Immobile i);
    void aggiorna(Immobile i);
    
    List<Immobile> trovaPerIndirizzo(String indirizzo);
    List<Immobile> trovaTutto();
    List<Immobile> trovaPerStato(String stato);
    List<Immobile> trovaPerDataVendita(LocalDate data);
    Immobile trovaPerId(int id);
}
