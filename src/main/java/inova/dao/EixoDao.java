package inova.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import inova.model.Eixo;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


/**
 *
 * @author Arnald Queiroga
 */
@Stateless
public class EixoDao {
    
   @PersistenceContext
    EntityManager em;
   
   public List<Eixo> getEixos() {
        Query q = em.createQuery("SELECT e FROM Eixo e ORDER BY e.descricao");
        return q.getResultList();
    }
   
    public List<Eixo> getEixos(String descricao) {
        Query q = em.createQuery("SELECT e FROM Eixo e WHERE e.descricao LIKE :nn ORDER BY t.id");
        q.setParameter("nn", "%"+ descricao + "%");
        return q.getResultList();
    }
    
}
