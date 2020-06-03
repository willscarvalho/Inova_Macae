package inova.dao;

import inova.model.Plano;
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
public class PlanoDao {
    
    @PersistenceContext
    EntityManager em;

    public List<Plano> getPlanos() {
        Query q = em.createQuery("SELECT p FROM Plano p ORDER BY p.id");
        return q.getResultList();
    }

}