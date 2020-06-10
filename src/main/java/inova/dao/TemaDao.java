package inova.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
    
}
