package inova.dao;

import inova.model.Coleta;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
*
* @author willian
*
**/

@Stateless
public class ColetaDao {

    @PersistenceContext
    EntityManager em;

    public List<Coleta> getColetas() {
        Query q = em.createQuery("SELECT c FROM Coleta c ORDER BY c.id");
        return q.getResultList();
    }
    
}