/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.st.managers.negocio;

import com.ub.st.daos.negocio.DaoAuditoria;
import com.ub.st.entities.negocio.Auditoria;
import com.ub.st.managers.commons.ManagerSQL;

/**
 *
 * @author Ulises Beltrán Gómez --- beltrangomezulises@gmail.com
 */
public class ManagerAuditoria extends ManagerSQL<Auditoria, Integer>{

    public ManagerAuditoria() {
        super(new DaoAuditoria());
    }

    @Override
    public String nombreColeccionParaRegistros() throws UnsupportedOperationException {
        return "auditorias";
    }
    
}
