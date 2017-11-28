/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.st.services.negocio;

import com.ub.st.entities.negocio.OrganismoDesconcentrado;
import com.ub.st.managers.negocio.ManagerOrganismoDesconcentrado;
import com.ub.st.services.commons.ServiceFacade;
import com.ub.st.utils.responses.Response;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Path;

/**
 * Catálogo de organismos desconcentrados
 * @author Ulises Beltrán Gómez --- beltrangomezulises@gmail.com
 */
@Path("/organismosDesconcentrados")
public class OrganismosDesconcentrados extends ServiceFacade<ManagerOrganismoDesconcentrado, OrganismoDesconcentrado, Integer> {
    
    public OrganismosDesconcentrados() {
        super(ManagerOrganismoDesconcentrado.class);
    }

    @Override
    public Response<OrganismoDesconcentrado> eliminar(HttpServletRequest request, String token, OrganismoDesconcentrado t) {
        return super.eliminar(request, token, t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<OrganismoDesconcentrado> modificar(HttpServletRequest request, String token, OrganismoDesconcentrado t) {
        return super.modificar(request, token, t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<OrganismoDesconcentrado> alta(HttpServletRequest request, String token, OrganismoDesconcentrado t) {
        return super.alta(request, token, t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<OrganismoDesconcentrado> detalle(HttpServletRequest request, String token, Integer id) {
        return super.detalle(request, token, id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response<List<OrganismoDesconcentrado>> listar(HttpServletRequest request, String token) {
        return super.listar(request, token); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
