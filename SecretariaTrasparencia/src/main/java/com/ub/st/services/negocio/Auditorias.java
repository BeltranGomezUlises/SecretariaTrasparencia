/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.st.services.negocio;

import com.ub.st.entities.negocio.Auditoria;
import com.ub.st.managers.negocio.ManagerAuditoria;
import com.ub.st.services.commons.ServiceFacade;
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
    
}
