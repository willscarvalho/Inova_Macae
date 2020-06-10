/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inova.ws; 

import inova.dao.SerieHistoricaDao;
import inova.model.SerieHistorica;
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
@Path("seriehistorica")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SerieHistoricaRes {

    @EJB 
    SerieHistoricaDao seriehistoricaDao;

    
    @GET
    @Path("buscarseriehistoricas")
    public List<SerieHistorica> buscarSerieHistoricas() {
        return seriehistoricaDao.getSerieHistoricas();
    }
    
    @GET
    @Path("buscarseriehistoricaobservacao/{observacao}")
    public List<SerieHistorica> buscarSerieHistoricas(@PathParam("observacao") String observacao) {
        return seriehistoricaDao.getSerieHistoricas(observacao);
    }
    
}
  