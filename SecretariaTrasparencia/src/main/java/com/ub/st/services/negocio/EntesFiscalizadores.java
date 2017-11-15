/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.st.services.negocio;

import com.ub.st.entities.negocio.EnteFiscalizador;
import com.ub.st.managers.negocio.ManagerEnteFiscalizador;
import com.ub.st.services.commons.ServiceFacade;
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
    
}
