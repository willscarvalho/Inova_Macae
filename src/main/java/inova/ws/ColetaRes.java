package inova.ws;

import inova.dao.ColetaDao;
import inova.model.Coleta;
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
@Path("coleta")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ColetaRes {
    
    @EJB 
    ColetaDao coletaDao;

    
    @GET
    @Path("buscarcoletas")
    public List<Coleta> buscarColetas() {
        return coletaDao.getColetas();
    }

}