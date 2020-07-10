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
    
    
    // Indicadores por Tema
       public List getListIndicadorPorTema(Integer idTema, Integer idEixo) {
        // Query q = em.createQuery("select c from Coleta c where c.indicador.tema.id = :t and c.indicador.tema.eixo.id = :e");
        Query q = em.createQuery("select i.indicador from Indicador i where i.tema.id = :t and i.tema.eixo.id = :e ");
        q.setParameter("t", idTema);
        q.setParameter("e", idEixo);
        return q.getResultList();
    }
    
   
    
}
