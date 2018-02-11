/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.st.daos.negocio;

import com.ub.st.daos.commons.DaoSQLFacade;
import com.ub.st.entities.negocio.Secretaria;
import com.ub.st.utils.UtilsDB;

/**
 *
 * @author Ulises Beltrán Gómez --- beltrangomezulises@gmail.com
 */
public class DaoSecretaria extends DaoSQLFacade<Secretaria, Integer> {

    public DaoSecretaria() {
        super(UtilsDB.getEMFactoryDefault(), Secretaria.class);
    }

}
