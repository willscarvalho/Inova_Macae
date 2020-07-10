package inova.dao;


import inova.model.Tema;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


/**
 *
 * @author willian
 */

@Stateless
public class TemaDao {
    
   @PersistenceContext
    EntityManager em;
   
   public List<Tema> getTemas() {
        Query q = em.createQuery("SELECT t FROM Tema t ORDER BY t.descricao");
        return q.getResultList();
    }
   
    public List<Tema> getTemas(String descricao) {
        Query q = em.createQuery("SELECT t FROM Tema t WHERE t.descricao LIKE :nn ORDER BY t.id");
        q.setParameter("nn", "%"+ descricao + "%");
        return q.getResultList();
    }
    
    // Buscar Temas por Eixo
    public List getTemasPorEixo(Integer idEixo){
        Query q = em.createQuery("select t.descricao from Tema t where t.eixo.id=:e");
        q.setParameter("e", idEixo);        
        return q.getResultList();
        
    }    
    
    
}
