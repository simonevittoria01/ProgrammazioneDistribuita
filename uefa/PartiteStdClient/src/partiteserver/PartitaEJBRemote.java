package partiteserver;

import jakarta.ejb.Remote;
import java.util.List;

@Remote
public interface PartitaEJBRemote {  
    public void inserisci(Partita p);
    public void elimina(Partita p);
    public void aggiorna(Partita p);
    
    public List<Partita> trovaPerTipo(String tipo);
    public List<Partita> trovaPerNumAmmonizioni(int ammonizioni);
    public List<Partita> trovaPerNumEspulsioni(int espulsioni);
    public List<Partita> trovaTutto();
    public List<Partita> trovaPerGoal(int goalTotali);
    public Partita trovaPerId(int id);
    public List<Partita> trovaPerPartiteGiocate(boolean giocata); 
}
