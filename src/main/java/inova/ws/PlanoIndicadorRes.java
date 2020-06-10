package inova.ws;

import inova.dao.PlanoIndicadorDao;
import inova.model.PlanoIndicador;
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
@Path("planoindicador")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PlanoIndicadorRes {
                
    @EJB 
    PlanoIndicadorDao planoIndicadorDao;

    
    @GET
    @Path("buscarplanosindicadores")
    public List<PlanoIndicador> buscarPlanosIndicador() {
        return planoIndicadorDao.getPlanosIndicadores();
    }

}