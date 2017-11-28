/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.st.services.negocio;

import com.ub.st.entities.negocio.EnteFiscalizador;
import com.ub.st.managers.negocio.ManagerEnteFiscalizador;
import com.ub.st.services.commons.ServiceFacade;
import com.ub.st.utils.responses.Response;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Path;

/**
 * servicios lcrud para entes fiscalizadores
 * @author Ulises Beltrán Gómez --- beltrangomezulises@gmail.com
 */
@Path("/entesFiscalizadores")
public class EntesFiscalizadores extends ServiceFacade<ManagerEnteFiscalizador, EnteFiscalizador, Integer>{
    
    public EntesFiscalizadores() {
        super(ManagerEnteFiscalizador.class);
    }

    @Override
    public Response<EnteFiscalizador> eliminar(HttpServletRequest request, String token, EnteFiscalizador t) {
        return super.eliminar(request, token, t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<EnteFiscalizador> modificar(HttpServletRequest request, String token, EnteFiscalizador t) {
        return super.modificar(request, token, t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<EnteFiscalizador> alta(HttpServletRequest request, String token, EnteFiscalizador t) {
        return super.alta(request, token, t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<EnteFiscalizador> detalle(HttpServletRequest request, String token, Integer id) {
        return super.detalle(request, token, id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<List<EnteFiscalizador>> listar(HttpServletRequest request, String token) {
        return super.listar(request, token); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
