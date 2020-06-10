package inova.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import inova.model.Coleta;
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
public class ColetaDao {
    
   @PersistenceContext
    EntityManager em;
   
   public List<Coleta> getColetas() {
        Query q = em.createQuery("SELECT c FROM Coleta c ORDER BY c.status");
        return q.getResultList();
    }
   
    public List<Coleta> getColetas(String descricao) {
        Query q = em.createQuery("SELECT c FROM Coleta c WHERE c.status LIKE :nn ORDER BY c.id");
        q.setParameter("nn", "%"+ descricao + "%");
        return q.getResultList();
    }
    
}
