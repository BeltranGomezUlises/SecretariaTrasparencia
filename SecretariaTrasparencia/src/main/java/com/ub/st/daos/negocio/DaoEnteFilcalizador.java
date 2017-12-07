package com.ub.st.daos.negocio;

import com.ub.st.daos.commons.DaoSQLFacade;
import com.ub.st.entities.negocio.EnteFiscalizador;
import com.ub.st.utils.UtilsDB;

/**
 *
 * @author Ulises Beltrán Gómez --- beltrangomezulises@gmail.com
 */
public class DaoEnteFilcalizador extends DaoSQLFacade<EnteFiscalizador, Integer>{
        
    public DaoEnteFilcalizador() {
        super(UtilsDB.getEMFactoryDefault(), EnteFiscalizador.class);
    }
                
}
