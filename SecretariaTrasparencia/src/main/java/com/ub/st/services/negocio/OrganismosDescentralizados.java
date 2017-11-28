/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.st.services.negocio;

import com.ub.st.entities.negocio.OrganismoDescentralizado;
import com.ub.st.managers.negocio.ManagerOrganismoDescentralizado;
import com.ub.st.services.commons.ServiceFacade;
import com.ub.st.utils.responses.Response;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Path;

/**
 * Catálogo de organismos descentralizados
 * @author Ulises Beltrán Gómez --- beltrangomezulises@gmail.com
 */
@Path("/organismosDescentralizados")
public class OrganismosDescentralizados extends ServiceFacade<ManagerOrganismoDescentralizado, OrganismoDescentralizado, Integer> {
    
    public OrganismosDescentralizados() {
        super(ManagerOrganismoDescentralizado.class);
    }

    @Override
    public Response<OrganismoDescentralizado> eliminar(HttpServletRequest request, String token, OrganismoDescentralizado t) {
        return super.eliminar(request, token, t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<OrganismoDescentralizado> modificar(HttpServletRequest request, String token, OrganismoDescentralizado t) {
        return super.modificar(request, token, t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<OrganismoDescentralizado> alta(HttpServletRequest request, String token, OrganismoDescentralizado t) {
        return super.alta(request, token, t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<OrganismoDescentralizado> detalle(HttpServletRequest request, String token, Integer id) {
        return super.detalle(request, token, id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<List<OrganismoDescentralizado>> listar(HttpServletRequest request, String token) {
        return super.listar(request, token); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
