/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inova.ws;

import inova.dao.TemaDao;
import inova.model.Tema;
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
 * @author willian
 */
@Named
@Path("tema")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TemaRes {

    @EJB 
    TemaDao temaDao;

    
    @GET
    @Path("buscartemas")
    public List<Tema> buscarTemas() {
        return temaDao.getTemas();
    }
    
    @GET
    @Path("buscartemasdescricao/{descricao}")
    public List<Tema> buscarTemas(@PathParam("descricao") String descricao) {
        return temaDao.getTemas(descricao);
    }
    
}
 