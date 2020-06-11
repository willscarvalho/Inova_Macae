package inova.dao;

import inova.model.Meta;
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
public class MetaDao {

    @PersistenceContext
    EntityManager em;

    public List<Meta> getMetas() {
        Query q = em.createQuery("SELECT m FROM Meta m ORDER BY m.id");
        return q.getResultList();
    }
}