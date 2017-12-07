/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.st.managers.negocio;

import com.ub.st.daos.negocio.DaoEnteFiscalizado;
import com.ub.st.entities.negocio.EnteFiscalizado;
import com.ub.st.managers.commons.ManagerSQL;

/**
 * 
 * @author Ulises Beltrán Gómez --- beltrangomezulises@gmail.com
 */
public class ManagerEnteFiscalizado extends ManagerSQL<EnteFiscalizado, Integer> {

    public ManagerEnteFiscalizado() {
        super(new DaoEnteFiscalizado());
    }

    @Override
    public String nombreColeccionParaRegistros() throws UnsupportedOperationException {
        return "entesFiscalizados";
    }
    
}
