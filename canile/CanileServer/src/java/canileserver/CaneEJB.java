package canileserver;

import static canileserver.Cane.TROVA_PER_ETA;
import static canileserver.Cane.TROVA_PER_ID;
import static canileserver.Cane.TROVA_PER_NOME;
import static canileserver.Cane.TROVA_PER_RAZZA;
import static canileserver.Cane.TROVA_PER_STATO;
import static canileserver.Cane.TROVA_PER_TAGLIA;
import static canileserver.Cane.TROVA_PER_TAGLIA_E_ETA;
import static canileserver.Cane.TROVA_TUTTO;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.jws.WebService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;

@Stateless
@LocalBean
@WebService
@Counter
public class CaneEJB implements CaneEJBRemote {
    
    @Inject
    private EntityManager em;

    public void inserisci(Cane c){
        em.persist(c);
    }
    public void elimina(Cane c){
        em.remove(em.merge(c));
    }
    public void aggiorna(Cane c){
        em.merge(c);
    }
    
    
    public Cane trovaPerId(int id){
        TypedQuery<Cane> q = em.createNamedQuery(TROVA_PER_ID, Cane.class);
        q.setParameter("id", id);
        return q.getSingleResult();
    }
    public List<Cane> trovaPerRazza(String razza){
        TypedQuery<Cane> q = em.createNamedQuery(TROVA_PER_RAZZA, Cane.class);
        q.setParameter("razza", razza);
        return q.getResultList();
    }
    public List<Cane> trovaPerNome(String nome){
        TypedQuery<Cane> q = em.createNamedQuery(TROVA_PER_NOME, Cane.class);
        q.setParameter("nome", nome);
        return q.getResultList();
    }
    public List<Cane> trovaPerTaglia(String taglia){        
        TypedQuery<Cane> q = em.createNamedQuery(TROVA_PER_TAGLIA, Cane.class);
        q.setParameter("taglia", taglia);
        return q.getResultList();    
    }
    public List<Cane> trovaPerEta(String eta){
        TypedQuery<Cane> q = em.createNamedQuery(TROVA_PER_ETA, Cane.class);
        q.setParameter("eta", eta);
        return q.getResultList();
    }
    public List<Cane> trovaPerStato(boolean stato){
        TypedQuery<Cane> q = em.createNamedQuery(TROVA_PER_STATO, Cane.class);
        q.setParameter("stato", stato);
        return q.getResultList();
    }
    public List<Cane> trovaTutto(){
        TypedQuery<Cane> q = em.createNamedQuery(TROVA_TUTTO, Cane.class);
        return q.getResultList();
    }
    public List<Cane> trovaPerTagliaEeta(String taglia, String eta){
        TypedQuery<Cane> q = em.createNamedQuery(TROVA_PER_TAGLIA_E_ETA, Cane.class);
        q.setParameter("taglia", taglia);
        q.setParameter("eta", eta);
        return q.getResultList();
    }
    
    @Validate
    public boolean adotta(int id){
        Cane c = this.trovaPerId(id);
        c.setStato(true);
        this.aggiorna(c);
        return true;
    }
}
