/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.st.managers.negocio;

import com.ub.st.daos.negocio.DaoEntidadCoordinada;
import com.ub.st.entities.negocio.EntidadCoordinada;
import com.ub.st.managers.commons.ManagerSQL;

/**
 *
 * @author Ulises Beltrán Gómez --- beltrangomezulises@gmail.com
 */
public class ManagerEntidadCoordinada extends ManagerSQL<EntidadCoordinada, Integer> {

    public ManagerEntidadCoordinada() {
        super(new DaoEntidadCoordinada());
    }

    @Override
    public String nombreColeccionParaRegistros() throws UnsupportedOperationException {
        return "entidadCoordinada";
    }

}
