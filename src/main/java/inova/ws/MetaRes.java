package inova.ws;

import inova.dao.MetaDao;
import inova.model.Meta;
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
@Path("meta")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MetaRes {

    @EJB
    MetaDao metaDao;

    @GET
    @Path("buscarmetas")
    public List<Meta> buscarMetas() {
        return metaDao.getMetas();
    }

}