/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.st.services.negocio;

import com.ub.st.entities.negocio.Observacion;
import com.ub.st.managers.negocio.ManagerObervacion;
import com.ub.st.services.commons.ServiceFacade;
import java.util.List;
import static java.util.stream.Collectors.toList;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author Ulises Beltrán Gómez --- beltrangomezulises@gmail.com
 */
@Path("/observaciones")
public class Obervaciones  extends ServiceFacade<ManagerObervacion, Observacion, Integer>{
    
    public Obervaciones() {
        super(ManagerObervacion.class);
    }
        
    @Path("/auditoria/{id}")
    @GET
    public List<Observacion> observacionesDeAuditoria(@HeaderParam("Authorization") String token, @PathParam("id") int id){        
        ManagerObervacion managerObervacion = new ManagerObervacion();
        return managerObervacion.stream().where( o -> o.getAuditoria().getId() == id).collect(toList());
    }
    
    
}
