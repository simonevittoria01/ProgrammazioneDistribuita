package immobileserver;

import static immobileserver.Immobile.TROVA_PER_DATA_VENDITA;
import static immobileserver.Immobile.TROVA_PER_ID;
import static immobileserver.Immobile.TROVA_PER_INDIRIZZO;
import static immobileserver.Immobile.TROVA_PER_STATO;
import static immobileserver.Immobile.TROVA_TUTTO;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.jws.WebService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.List;

@Stateless
@LocalBean
@WebService
@Counter
public class ImmobileEJB implements ImmobileEJBRemote {
    
    @Inject
    private EntityManager em;

    public void inserisci(Immobile i){
        em.persist(i);
    }
    public void elimina(Immobile i){
        em.remove(em.merge(i));
    }
    public void aggiorna(Immobile i){
        em.merge(i);
    }
    
    public List<Immobile> trovaPerIndirizzo(String indirizzo){
        TypedQuery<Immobile> q = em.createNamedQuery(TROVA_PER_INDIRIZZO, Immobile.class);
        q.setParameter("indirizzo", indirizzo);
        return q.getResultList();
    }
    public List<Immobile> trovaTutto(){
        TypedQuery<Immobile> q = em.createNamedQuery(TROVA_TUTTO, Immobile.class);
        return q.getResultList();
    }
    public List<Immobile> trovaPerStato(String stato){
        TypedQuery<Immobile> q = em.createNamedQuery(TROVA_PER_STATO, Immobile.class);
        q.setParameter("stato", stato);
        return q.getResultList();
    }
    public List<Immobile> trovaPerDataVendita(LocalDate data){
        TypedQuery<Immobile> q = em.createNamedQuery(TROVA_PER_DATA_VENDITA, Immobile.class);
        q.setParameter("data", data);
        return q.getResultList();
    }
    public Immobile trovaPerId(int id){
        try{
            TypedQuery<Immobile> q = em.createNamedQuery(TROVA_PER_ID, Immobile.class);
            q.setParameter("id", id);
            return q.getSingleResult();
        }catch(NoResultException e){
            return null;
        }
    }
}
