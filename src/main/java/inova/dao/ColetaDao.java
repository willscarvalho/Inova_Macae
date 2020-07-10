package inova.dao;

import inova.model.Coleta;
import inova.model.Indicador;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author willian
 *
 *
 */
@Stateless
public class ColetaDao {

    @PersistenceContext
    EntityManager em;

    public List<Coleta> getColetas() {
        Query q = em.createQuery("SELECT c FROM Coleta c ORDER BY c.id");
        return q.getResultList();
    }

//      public List getListColetaporIndicador(Integer idTema, Integer IdEixo) {
//       // Query q = em.createQuery("select c from Coleta c where c.indicador.tema.id = :t and c.indicador.tema.eixo.id = :e");
//        Query q = em.createQuery("select c.ano, count(c.coleta) from Coleta c where c.indicador.tema.id = :t and c.indicador.tema.eixo.id = :e group by c.ano");
//        q.setParameter("t", idTema);    
//        q.setParameter("e", IdEixo); 
//        return q.getResultList();
//    }   
    
    
    // Coleta por Indicador (Responsável por gerar os gráficos finais)    
    public List getListColetaporIndicador(Integer idIndicador, Integer idTema, Integer idEixo) {
        // Query q = em.createQuery("select c from Coleta c where c.indicador.tema.id = :t and c.indicador.tema.eixo.id = :e");
        Query q = em.createQuery("select c.ano, sum(c.coleta) from Coleta c where c.indicador.id=:i and c.indicador.tema.id = :t and c.indicador.tema.eixo.id = :e group by c.ano");
        q.setParameter("i", idIndicador);
        q.setParameter("t", idTema);
        q.setParameter("e", idEixo);

        return q.getResultList();
    }

}
