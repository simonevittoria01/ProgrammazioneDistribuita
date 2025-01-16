package sanremoserver;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.jws.WebService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;
import static sanremoserver.Canzone.TROVA_PER_CATEGORIA;
import static sanremoserver.Canzone.TROVA_PER_ID;
import static sanremoserver.Canzone.TROVA_PER_VOTI;
import static sanremoserver.Canzone.TROVA_TUTTO;

@Stateless
@LocalBean
@WebService
public class CanzoneEJB implements CanzoneEJBRemote {
    
    @Inject
    private EntityManager em;
           
    public void inserisci(Canzone c){
        em.persist(c);
    }
    public void elimina(Canzone c){
        em.remove(em.merge(c));
    }
    public void aggiorna(Canzone c){
        em.merge(c);
    }
    
    public Canzone trovaPerId(int id){
        TypedQuery<Canzone> q = em.createNamedQuery(TROVA_PER_ID, Canzone.class);
        q.setParameter("id", id);
        return q.getSingleResult();
    }
    
    @Counter
    public List<Canzone> trovaPerCategoria(String categoria){
        TypedQuery<Canzone> q = em.createNamedQuery(TROVA_PER_CATEGORIA, Canzone.class);
        q.setParameter("categoria", categoria);
        return q.getResultList();
    }
    
    @Counter
    public List<Canzone> trovaTutto(){
        TypedQuery<Canzone> q = em.createNamedQuery(TROVA_TUTTO, Canzone.class);
        return q.getResultList();
    }
    
    @Validate
    public List<Canzone> trovaPerVoti(int voti){
        TypedQuery<Canzone> q = em.createNamedQuery(TROVA_PER_VOTI, Canzone.class);
        q.setParameter("voti", voti);
        return q.getResultList();
    }
    
    public void modificaVoti(int id, int voti){
        Canzone c = this.trovaPerId(id);
        c.setVoti(voti);
        this.aggiorna(c);  
    }       
}
