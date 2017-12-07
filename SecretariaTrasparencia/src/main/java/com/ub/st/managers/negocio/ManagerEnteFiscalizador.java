/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.st.managers.negocio;

import com.ub.st.daos.negocio.DaoEnteFilcalizador;
import com.ub.st.entities.negocio.EnteFiscalizador;
import com.ub.st.managers.commons.ManagerSQL;

/**
 *
 * @author Ulises Beltrán Gómez --- beltrangomezulises@gmail.com
 */
public class ManagerEnteFiscalizador extends ManagerSQL<EnteFiscalizador, Integer> {

    public ManagerEnteFiscalizador() {
        super(new DaoEnteFilcalizador());
    }

    @Override
    public String nombreColeccionParaRegistros() throws UnsupportedOperationException {
        return "entesFiscalizadores";
    }
    
}
