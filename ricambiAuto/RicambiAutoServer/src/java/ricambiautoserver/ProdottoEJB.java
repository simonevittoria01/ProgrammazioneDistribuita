package ricambiautoserver;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.jws.WebService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;
import static ricambiautoserver.Prodotto.TROVA_DA_ORDINARE;
import static ricambiautoserver.Prodotto.TROVA_PER_CATEGORIA;
import static ricambiautoserver.Prodotto.TROVA_PER_ID;
import static ricambiautoserver.Prodotto.TROVA_TUTTI;

@Stateless
@LocalBean
@WebService
@Counter
public class ProdottoEJB implements ProdottoEJBRemote {
    
    @Inject
    private EntityManager em;
    
    public void inserisci(Prodotto p){
        em.persist(p);
    }
    public void elimina(Prodotto p){
        em.remove(em.merge(p));
    }
    public void aggiorna(Prodotto p){
        em.merge(p);
    }
    
    public Prodotto trovaPerId(int id){
        TypedQuery<Prodotto> q = em.createNamedQuery(TROVA_PER_ID, Prodotto.class);
        q.setParameter("id", id);
        return q.getSingleResult();
    }
    
    public List<Prodotto> trovaPerCategoria(String categoria){
        TypedQuery<Prodotto> q = em.createNamedQuery(TROVA_PER_CATEGORIA, Prodotto.class);
        q.setParameter("categoria", categoria);
        return q.getResultList();
    }
    
    public List<Prodotto> trovaTutti(){
        TypedQuery<Prodotto> q = em.createNamedQuery(TROVA_TUTTI, Prodotto.class);
        return q.getResultList();
    }
    public List<Prodotto> trovaDaOrdinare(){
        TypedQuery<Prodotto> q = em.createNamedQuery(TROVA_DA_ORDINARE, Prodotto.class);
        return q.getResultList();
    } 
    
    public void modificaPrezzo(int id, double prezzo){
        Prodotto p = this.trovaPerId(id);
        p.setPrezzo(p.getPrezzo()+prezzo);
        this.aggiorna(p);
    }
}
