package inova.ws;

import inova.dao.PlanoDao;
import inova.model.Plano;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
*
* @author willian
*
**/

@Named
@Path("plano")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PlanoRes {
        
    @EJB 
    PlanoDao planoDao;

    
    @GET
    @Path("buscarplanos")
    public List<Plano> buscarPlanos() {
        return planoDao.getPlanos();
    }
}