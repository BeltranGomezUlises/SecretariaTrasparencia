/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.st.services.negocio;

import com.ub.st.entities.negocio.EnteFiscalizado;
import com.ub.st.managers.negocio.ManagerEnteFiscalizado;
import com.ub.st.services.commons.ServiceFacade;
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
    
}
