package inova.dao;

import inova.model.PlanoIndicador;
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
public class PlanoIndicadorDao {

    @PersistenceContext
    EntityManager em;

    public List<PlanoIndicador> getPlanosIndicadores() {
        Query q = em.createQuery("SELECT pi FROM PlanoIndicador pi ORDER BY pi.id");
        return q.getResultList();
    }
    
}