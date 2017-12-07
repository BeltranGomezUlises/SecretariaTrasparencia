/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.st.services.negocio;

import com.ub.st.entities.negocio.EntidadCoordinada;
import com.ub.st.managers.negocio.ManagerEntidadCoordinada;
import com.ub.st.services.commons.ServiceFacade;
import com.ub.st.utils.responses.Response;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Path;

/**
 * Catálogo de entidades coordinadas
 * @author Ulises Beltrán Gómez --- beltrangomezulises@gmail.com
 */
@Path("/entidadesCoordinadas")
public class EntidadesCoordinadas extends ServiceFacade<ManagerEntidadCoordinada, EntidadCoordinada, Integer>{
    
    public EntidadesCoordinadas() {
        super(ManagerEntidadCoordinada.class);
    }

    @Override
    public Response<EntidadCoordinada> eliminar(HttpServletRequest request, String token, EntidadCoordinada t) {
        return super.eliminar(request, token, t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<EntidadCoordinada> modificar(HttpServletRequest request, String token, EntidadCoordinada t) {
        return super.modificar(request, token, t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<EntidadCoordinada> alta(HttpServletRequest request, String token, EntidadCoordinada t) {
        return super.alta(request, token, t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<EntidadCoordinada> detalle(HttpServletRequest request, String token, Integer id) {
        return super.detalle(request, token, id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<List<EntidadCoordinada>> listar(HttpServletRequest request, String token) {
        return super.listar(request, token); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
