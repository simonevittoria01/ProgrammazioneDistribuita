package decretiserver;

import jakarta.ejb.Remote;
import java.util.List;

@Remote
public interface DecretoEJBRemote {    
    void inserisci(Decreto d);
    void elimina(Decreto d);
    void aggiorna(Decreto d);
    
    Decreto trovaPerId(int id);
    List<Decreto> trovaPerEmergenza(String emergenza);
    List<Decreto> trovaTutto();
    List<Decreto> trovaPerCategoria(String categoria);
    List<Decreto> trovaPerPresentazioni(int presentazioni);  
}
