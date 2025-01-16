package decretiserver;

import static decretiserver.Decreto.TROVA_PER_CATEGORIA;
import static decretiserver.Decreto.TROVA_PER_EMERGENZA;
import static decretiserver.Decreto.TROVA_PER_ID;
import static decretiserver.Decreto.TROVA_PER_PRESENTAZIONI;
import static decretiserver.Decreto.TROVA_TUTTO;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;

@Stateless
@LocalBean
@Counter
public class DecretoEJB implements DecretoEJBRemote {
    
    @Inject
    private EntityManager em;

    public void inserisci(Decreto d){
        em.persist(d);
    }
    public void elimina(Decreto d){
        em.remove(em.merge(d));
    }
    public void aggiorna(Decreto d){
        em.merge(d);
    }
    
    public Decreto trovaPerId(int id){
        TypedQuery<Decreto> q = em.createNamedQuery(TROVA_PER_ID, Decreto.class);
        q.setParameter("id", id);
        return q.getSingleResult();
    }
    public List<Decreto> trovaPerEmergenza(String emergenza){
        TypedQuery<Decreto> q = em.createNamedQuery(TROVA_PER_EMERGENZA, Decreto.class);
        q.setParameter("emergenza", emergenza);
        return q.getResultList();
    }
    public List<Decreto> trovaTutto(){
        TypedQuery<Decreto> q = em.createNamedQuery(TROVA_TUTTO, Decreto.class);
        return q.getResultList();
    }
    public List<Decreto> trovaPerCategoria(String categoria){
        TypedQuery<Decreto> q = em.createNamedQuery(TROVA_PER_CATEGORIA, Decreto.class);
        q.setParameter("tipoEmergenza", categoria);
        return q.getResultList();
    }
    public List<Decreto> trovaPerPresentazioni(int presentazioni){
        TypedQuery<Decreto> q = em.createNamedQuery(TROVA_PER_PRESENTAZIONI, Decreto.class);
        q.setParameter("numeroPresentazioni", presentazioni);
        return q.getResultList();
    }
}
