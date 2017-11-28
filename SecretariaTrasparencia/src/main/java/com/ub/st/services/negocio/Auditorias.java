/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.st.services.negocio;

import com.ub.st.entities.negocio.Auditoria;
import com.ub.st.managers.negocio.ManagerAuditoria;
import com.ub.st.services.commons.ServiceFacade;
import com.ub.st.utils.responses.Response;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Path;

/**
 * servicios lcrud para auditorias
 * @author Ulises Beltrán Gómez --- beltrangomezulises@gmail.com
 */
@Path("/auditorias")
public class Auditorias extends ServiceFacade<ManagerAuditoria, Auditoria, Integer>{
    
    public Auditorias() {
        super(ManagerAuditoria.class);
    }

    @Override
    public Response<Auditoria> eliminar(HttpServletRequest request, String token, Auditoria t) {
        return super.eliminar(request, token, t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<Auditoria> modificar(HttpServletRequest request, String token, Auditoria t) {
        return super.modificar(request, token, t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<Auditoria> alta(HttpServletRequest request, String token, Auditoria t) {
        return super.alta(request, token, t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<Auditoria> detalle(HttpServletRequest request, String token, Integer id) {
        return super.detalle(request, token, id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<List<Auditoria>> listar(HttpServletRequest request, String token) {
        return super.listar(request, token); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
