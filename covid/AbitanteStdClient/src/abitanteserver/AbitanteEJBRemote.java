package abitanteserver;

import jakarta.ejb.Remote;
import java.util.List;

@Remote
public interface AbitanteEJBRemote {  
    public void inserisci(Abitante a);
    public void elimina(Abitante a);
    public void aggiorna(Abitante a);
    
    public List<Abitante> trovaPerCategoria(String categoria);
    public List<Abitante> trovaPerContrattoCovid(boolean contrattoCovid);
    public List<Abitante> trovaPerEta(int eta);
    public List<Abitante> trovaTutto();
    public List<Abitante> trovaPerCategoriaEeta(String categoria, int eta);
    public List<Abitante> trovaPerCategoriaEinteresseVaccino(String categoria, String interesseVaccino);
    public Abitante trovaPerId(int id); 
}
