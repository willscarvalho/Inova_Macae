package inova.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import inova.model.Coleta;
import inova.model.Indicador;
import inova.model.Meta;
import inova.model.MetaColeta;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
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
        q.setParameter("nn", "%" + descricao + "%");
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

    public MetaColeta getMetaColetaAnoPorIndicador(Integer idIndicador, Integer ano) {
        Calendar dataInicio = Calendar.getInstance();
        dataInicio.set(Calendar.YEAR, ano);
        dataInicio.set(Calendar.MONTH, 0);
        dataInicio.set(Calendar.DAY_OF_MONTH, 1);

        Calendar dataFim = Calendar.getInstance();
        dataInicio.set(Calendar.YEAR, ano);
        dataInicio.set(Calendar.MONTH, 11);
        dataInicio.set(Calendar.DAY_OF_MONTH, 31);

        Query qMeta = em.createQuery("select m from Meta m where m.idIndicador = :idI and m.dtInicio >= :dI and m.dtInicio <= :dF and m.excluido = 'N'");
        qMeta.setParameter("idI", idIndicador);
        qMeta.setParameter("dI", dataInicio);
        qMeta.setParameter("dF", dataFim);

        List<Meta> metas = qMeta.getResultList();

        Double meta = 0.0;
        if (!(metas.isEmpty())) {
            meta = metas.get(0).getValor().doubleValue();
        }

        Query qColeta = em.createQuery("select c from Coleta c where c.indicador.id = :idI and c.ano = :an");
        qColeta.setParameter("idI", idIndicador);
        qColeta.setParameter("an", ano);
        List<Coleta> coletas = qColeta.getResultList();

        Double coleta = 0.0;
        for (Coleta c : coletas) {
            coleta += c.getColeta().doubleValue();
        }

        return new MetaColeta(idIndicador, ano, meta, coleta);

    }

    public List<MetaColeta> getMetaColetaPorIndicador(Integer idIndicador) {
        Query qMeta = em.createQuery("select m from Meta m where m.idIndicador = :idI and m.excluido = 'N' order by m.dtInicio");
        qMeta.setParameter("idI", idIndicador);

        List<Meta> metas = qMeta.getResultList();

        List<MetaColeta> metasColetas = new ArrayList();
        for (Meta m : metas) {
            Double meta = m.getValor().doubleValue();
            Integer ano = m.getDtInicio().get(Calendar.YEAR);

            Query qColeta = em.createQuery("select c from Coleta c where c.indicador.id = :idI and c.ano = :an");
            qColeta.setParameter("idI", idIndicador);
            qColeta.setParameter("an", ano);
            List<Coleta> coletas = qColeta.getResultList();

            Double coleta = 0.0;
            for (Coleta c : coletas) {
                coleta += c.getColeta().doubleValue();
            }
            
            MetaColeta mc = new MetaColeta(idIndicador, ano, meta, coleta);
            metasColetas.add(mc);
        }
        return metasColetas;

    }

}
