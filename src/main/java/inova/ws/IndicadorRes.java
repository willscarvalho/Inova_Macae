/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inova.ws;

import inova.dao.IndicadorDao;
import inova.model.Indicador;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



/**
 *
 * @author Arnald Queiroga
 */
@Named
@Path("indicador")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class IndicadorRes {

    @EJB 
    IndicadorDao indicadorDao;

    
    @GET
    @Path("buscarindicadores")
    public List<Indicador> buscarIndicadores() {
        return indicadorDao.getIndicadores();
    }
    
    @GET
    @Path("buscarindicadoresdescricao/{descricao}")
    public List<Indicador> buscarIndicadores(@PathParam("descricao") String descricao) {
        return indicadorDao.getIndicadores(descricao);
    }
    
     // Indicadores por Tema    
    @GET
    @Path("buscarindicadorportema/{idTema}/{idEixo}")
    public List buscarIndicadorPorTema(@PathParam("idTema") Integer idTema, @PathParam("idEixo") Integer idEixo){
        return indicadorDao.getListIndicadorPorTema(idTema, idEixo);
    }
}
  