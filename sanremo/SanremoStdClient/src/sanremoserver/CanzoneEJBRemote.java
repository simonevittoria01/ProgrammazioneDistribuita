package sanremoserver;

import jakarta.ejb.Remote;
import java.util.List;

@Remote
public interface CanzoneEJBRemote {   
    void inserisci(Canzone c);
    void elimina(Canzone c);
    void aggiorna(Canzone c);
    
    Canzone trovaPerId(int id);
    List<Canzone> trovaPerCategoria(String categoria);
    List<Canzone> trovaTutto();
    List<Canzone> trovaPerVoti(int voti);
    
    void modificaVoti(int id, int voti);   
}
