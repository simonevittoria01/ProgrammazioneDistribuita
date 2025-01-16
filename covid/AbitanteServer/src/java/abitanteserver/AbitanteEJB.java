package abitanteserver;

import static abitanteserver.Abitante.TROVA_PER_CATEGORIA;
import static abitanteserver.Abitante.TROVA_PER_CATEGORIA_E_ETA;
import static abitanteserver.Abitante.TROVA_PER_CATEGORIA_E_INTERESSE_VACCINO;
import static abitanteserver.Abitante.TROVA_PER_CONTRATTO_COVID;
import static abitanteserver.Abitante.TROVA_PER_ETA;
import static abitanteserver.Abitante.TROVA_PER_ID;
import static abitanteserver.Abitante.TROVA_TUTTO;
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
public class AbitanteEJB implements AbitanteEJBRemote {
    
    @Inject
    private EntityManager em;
    
    public void inserisci(Abitante a){
        em.persist(a);
    }
    public void elimina(Abitante a){
        em.remove(em.merge(a));
    }
    public void aggiorna(Abitante a){
        em.merge(a);
    }
    
    public List<Abitante> trovaPerCategoria(String categoria){
        TypedQuery<Abitante> q = em.createNamedQuery(TROVA_PER_CATEGORIA, Abitante.class);
        q.setParameter("categoria", categoria);
        return q.getResultList();
    }
    
    public List<Abitante> trovaPerContrattoCovid(boolean contrattoCovid){
        TypedQuery<Abitante> q = em.createNamedQuery(TROVA_PER_CONTRATTO_COVID, Abitante.class);
        q.setParameter("contrattoCovid", contrattoCovid);
        return q.getResultList();
    }
    
    public List<Abitante> trovaPerEta(int eta){
        TypedQuery<Abitante> q = em.createNamedQuery(TROVA_PER_ETA, Abitante.class);
        q.setParameter("eta", eta);
        return q.getResultList();
    }
    public List<Abitante> trovaTutto(){
        TypedQuery<Abitante> q = em.createNamedQuery(TROVA_TUTTO, Abitante.class);
        return q.getResultList();
    }
    public List<Abitante> trovaPerCategoriaEeta(String categoria, int eta){
        TypedQuery<Abitante> q = em.createNamedQuery(TROVA_PER_CATEGORIA_E_ETA, Abitante.class);
        q.setParameter("categoria", categoria);
        q.setParameter("eta", eta);
        return q.getResultList();
    }
    public List<Abitante> trovaPerCategoriaEinteresseVaccino(String categoria, String interesseVaccino){
        TypedQuery<Abitante> q = em.createNamedQuery(TROVA_PER_CATEGORIA_E_INTERESSE_VACCINO, Abitante.class);
        q.setParameter("categoria", categoria);
        q.setParameter("interesseVaccino", interesseVaccino);
        return q.getResultList();
    }
    public Abitante trovaPerId(int id){
        TypedQuery<Abitante> q = em.createNamedQuery(TROVA_PER_ID, Abitante.class);
        q.setParameter("id", id);
        return q.getSingleResult();        
    }
}
