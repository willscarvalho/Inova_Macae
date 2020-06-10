package inova.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import inova.model.Indicador;
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
public class IndicadorDao {
    
   @PersistenceContext
    EntityManager em;
   
   public List<Indicador> getIndicadores() {
        Query q = em.createQuery("SELECT i FROM Indicador i ORDER BY i.descricao");
        return q.getResultList();
    }
   
    public List<Indicador> getIndicadores(String descricao) {
        Query q = em.createQuery("SELECT i FROM Indicador i WHERE i.descricao LIKE :nn ORDER BY i.id");
        q.setParameter("nn", "%"+ descricao + "%");
        return q.getResultList();
    }
    
}
