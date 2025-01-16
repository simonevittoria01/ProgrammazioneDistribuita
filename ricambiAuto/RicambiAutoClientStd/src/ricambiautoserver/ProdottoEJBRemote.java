package ricambiautoserver;

import jakarta.ejb.Remote;
import java.util.List;

@Remote
public interface ProdottoEJBRemote {
    void inserisci(Prodotto p);
    void elimina(Prodotto p);
    void aggiorna(Prodotto p);
    
    Prodotto trovaPerId(int id);
    List<Prodotto> trovaPerCategoria(String categoria);
    List<Prodotto> trovaTutti();
    List<Prodotto> trovaDaOrdinare();
    void modificaPrezzo(int id, double prezzo);
}
