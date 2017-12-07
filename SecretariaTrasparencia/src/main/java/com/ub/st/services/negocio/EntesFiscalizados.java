/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.st.services.negocio;

import com.ub.st.entities.negocio.EnteFiscalizado;
import com.ub.st.managers.negocio.ManagerEnteFiscalizado;
import com.ub.st.services.commons.ServiceFacade;
import com.ub.st.utils.responses.Response;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Path;

/**
 * servicios lcrud para entes fiscalizados
 * @author Ulises Beltrán Gómez --- beltrangomezulises@gmail.com
 */
@Path("/entesFiscalizados")
public class EntesFiscalizados extends ServiceFacade<ManagerEnteFiscalizado, EnteFiscalizado, Integer> {
    
    public EntesFiscalizados() {
        super(ManagerEnteFiscalizado.class);
    }

    @Override
    public Response<EnteFiscalizado> eliminar(HttpServletRequest request, String token, EnteFiscalizado t) {
        return super.eliminar(request, token, t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<EnteFiscalizado> modificar(HttpServletRequest request, String token, EnteFiscalizado t) {
        return super.modificar(request, token, t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<EnteFiscalizado> alta(HttpServletRequest request, String token, EnteFiscalizado t) {
        return super.alta(request, token, t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<EnteFiscalizado> detalle(HttpServletRequest request, String token, Integer id) {
        return super.detalle(request, token, id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<List<EnteFiscalizado>> listar(HttpServletRequest request, String token) {
        return super.listar(request, token); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
