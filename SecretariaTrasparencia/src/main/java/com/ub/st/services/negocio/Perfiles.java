/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.st.services.negocio;

import com.ub.st.entities.negocio.Perfil;
import com.ub.st.managers.negocio.ManagerPerfil;
import com.ub.st.services.commons.ServiceFacade;
import com.ub.st.utils.responses.Response;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Path;

/**
 * servicios LCRUd para los perfiles del sistema
 * @author Ulises Beltrán Gómez --- beltrangomezulises@gmail.com
 */
@Path("/perfiles")
public class Perfiles extends ServiceFacade<ManagerPerfil, Perfil, Integer>{
    
    public Perfiles() {
        super(ManagerPerfil.class);
    }

    @Override
    public Response<Perfil> eliminar(HttpServletRequest request, String token, Perfil t) {
        return super.eliminar(request, token, t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<Perfil> modificar(HttpServletRequest request, String token, Perfil t) {
        return super.modificar(request, token, t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<Perfil> alta(HttpServletRequest request, String token, Perfil t) {
        return super.alta(request, token, t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<Perfil> detalle(HttpServletRequest request, String token, Integer id) {
        return super.detalle(request, token, id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<List<Perfil>> listar(HttpServletRequest request, String token) {
        return super.listar(request, token); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
