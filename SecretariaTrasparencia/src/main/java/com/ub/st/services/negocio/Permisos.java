/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.st.services.negocio;

import com.ub.st.entities.negocio.Permiso;
import com.ub.st.managers.negocio.ManagerPermiso;
import com.ub.st.services.commons.ServiceFacade;
import com.ub.st.utils.responses.Response;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Path;

/**
 * servicios LCRUD para los permisos del sistema
 * @author Ulises Beltrán Gómez --- beltrangomezulises@gmail.com
 */
@Path("/permisos")
public class Permisos extends ServiceFacade<ManagerPermiso, Permiso, String>{
    
    public Permisos() {
        super(ManagerPermiso.class);
    }

    @Override
    public Response<Permiso> eliminar(HttpServletRequest request, String token, Permiso t) {
        return super.eliminar(request, token, t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<Permiso> modificar(HttpServletRequest request, String token, Permiso t) {
        return super.modificar(request, token, t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<Permiso> alta(HttpServletRequest request, String token, Permiso t) {
        return super.alta(request, token, t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<Permiso> detalle(HttpServletRequest request, String token, String id) {
        return super.detalle(request, token, id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<List<Permiso>> listar(HttpServletRequest request, String token) {
        return super.listar(request, token); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
