/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.st.services.negocio;

import com.ub.st.entities.negocio.CoordinacionGeneral;
import com.ub.st.managers.negocio.ManagerCoordinacionGeneral;
import com.ub.st.services.commons.ServiceFacade;
import com.ub.st.utils.responses.Response;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Path;

/**
 * Catálogo de coordinaciones generales
 * @author Ulises Beltrán Gómez --- beltrangomezulises@gmail.com
 */
@Path("/coordinacionesGenerales")
public class CoordinacionesGenerales extends ServiceFacade<ManagerCoordinacionGeneral, CoordinacionGeneral, Integer> {
    
    public CoordinacionesGenerales() {
        super(ManagerCoordinacionGeneral.class);
    }

    @Override
    public Response<CoordinacionGeneral> eliminar(HttpServletRequest request, String token, CoordinacionGeneral t) {
        return super.eliminar(request, token, t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<CoordinacionGeneral> modificar(HttpServletRequest request, String token, CoordinacionGeneral t) {
        return super.modificar(request, token, t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<CoordinacionGeneral> alta(HttpServletRequest request, String token, CoordinacionGeneral t) {
        return super.alta(request, token, t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<CoordinacionGeneral> detalle(HttpServletRequest request, String token, Integer id) {
        return super.detalle(request, token, id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<List<CoordinacionGeneral>> listar(HttpServletRequest request, String token) {
        return super.listar(request, token); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
