/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inova.ws;

import inova.dao.EixoDao;
import inova.model.Eixo;
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
@Path("eixo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EixoRes {

    @EJB 
    EixoDao eixoDao;

    
    @GET
    @Path("buscareixos")
    public List<Eixo> buscarEixos() {
        return eixoDao.getEixos();
    }
    
    @GET
    @Path("buscareixosdescricao/{descricao}")
    public List<Eixo> buscarEixos(@PathParam("descricao") String descricao) {
        return eixoDao.getEixos(descricao);
    }
    
}
