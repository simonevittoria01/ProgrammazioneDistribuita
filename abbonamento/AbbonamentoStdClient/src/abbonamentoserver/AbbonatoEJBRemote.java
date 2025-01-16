package abbonamentoserver;

import jakarta.ejb.Remote;
import java.time.LocalDate;
import java.util.List;

@Remote
public interface AbbonatoEJBRemote {  
    public void inserisci(Abbonato a);
    public void elimina(Abbonato a);
    public void aggiorna(Abbonato a);
    
    public List<Abbonato> trovaPerStato(String stato);
    public List<Abbonato> trovaTutto();
    public List<Abbonato> trovaPerScadenza(LocalDate data);
    public List<Abbonato> trovaPerTipo(String stato, LocalDate data, String tipo);
    public Abbonato trovaPerId(int id);    
}
