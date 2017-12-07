/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.st.services.negocio;

import com.ub.st.entities.negocio.Secretaria;
import com.ub.st.managers.negocio.ManagerSecretaria;
import com.ub.st.services.commons.ServiceFacade;
import com.ub.st.utils.responses.Response;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Path;

/**
 * servicios LCRUD para las secretarias
 * @author Ulises Beltrán Gómez --- beltrangomezulises@gmail.com
 */
@Path("/secretarias")
public class Secretarias extends ServiceFacade<ManagerSecretaria, Secretaria, Integer>{
    
    public Secretarias() {
        super(ManagerSecretaria.class);
    }

    @Override
    public Response<Secretaria> eliminar(HttpServletRequest request, String token, Secretaria t) {
        return super.eliminar(request, token, t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<Secretaria> modificar(HttpServletRequest request, String token, Secretaria t) {
        return super.modificar(request, token, t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<Secretaria> alta(HttpServletRequest request, String token, Secretaria t) {
        return super.alta(request, token, t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<Secretaria> detalle(HttpServletRequest request, String token, Integer id) {
        return super.detalle(request, token, id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<List<Secretaria>> listar(HttpServletRequest request, String token) {
        return super.listar(request, token); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
