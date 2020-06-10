package inova.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import inova.model.Orgao;
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
public class OrgaoDao {
    
   @PersistenceContext
    EntityManager em;
   
   public List<Orgao> getOrgaos() {
        Query q = em.createQuery("SELECT o FROM Orgao o ORDER BY o.txTipo");
        return q.getResultList();
    }
   
    public List<Orgao> getOrgaos(String txtipo) {
        Query q = em.createQuery("SELECT o FROM Orgao o WHERE o.txTipo LIKE :nn ORDER BY o.id");
        q.setParameter("nn", "%"+ txtipo + "%");
        return q.getResultList();
    }
    
}
