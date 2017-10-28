/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.st.managers.negocio;

import com.ub.st.daos.negocio.DaoUsuario;
import com.ub.st.entities.negocio.Usuario;
import com.ub.st.managers.commons.ManagerSQL;

/**
 *
 * @author Ulises Beltrán Gómez --- beltrangomezulises@gmail.com
 */
public class ManagerUsuario extends ManagerSQL<Usuario, Integer>{

    public ManagerUsuario() {
        super(new DaoUsuario());
    }

    @Override
    public String nombreColeccionParaRegistros() throws UnsupportedOperationException {
        return "usuarios";
    }
    
}
