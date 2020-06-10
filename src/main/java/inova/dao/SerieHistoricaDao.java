package inova.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import inova.model.SerieHistorica;
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
public class SerieHistoricaDao {
    
   @PersistenceContext
    EntityManager em;
   
   public List<SerieHistorica> getSerieHistoricas() {
        Query q = em.createQuery("SELECT s FROM SerieHistorica s ORDER BY s.observacao");
        return q.getResultList();
    }
   
    public List<SerieHistorica> getSerieHistoricas(String descricao) {
        Query q = em.createQuery("SELECT s FROM SerieHistorica s WHERE s.observacao LIKE :nn ORDER BY s.id");
        q.setParameter("nn", "%"+ descricao + "%");
        return q.getResultList();
    }
    
}
