/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inova.ws;

import inova.dao.OrgaoDao;
import inova.model.Orgao;
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
@Path("orgao")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OrgaoRes {

    @EJB 
    OrgaoDao orgaoDao;

    
    @GET
    @Path("buscarorgaos")
    public List<Orgao> buscarOrgaos() {
        return orgaoDao.getOrgaos();
    }
    
    @GET
    @Path("buscarorgaostxtipo/{txtipo}")
    public List<Orgao> buscarOrgaos(@PathParam("txtipo") String txtipo) {
        return orgaoDao.getOrgaos(txtipo);
    }
    
}
