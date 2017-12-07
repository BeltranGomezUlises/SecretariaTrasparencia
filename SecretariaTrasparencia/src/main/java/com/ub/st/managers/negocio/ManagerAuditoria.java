/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.st.managers.negocio;

import com.ub.st.daos.negocio.DaoAuditoria;
import com.ub.st.daos.negocio.DaoSeguimiento;
import com.ub.st.entities.negocio.Auditoria;
import com.ub.st.entities.negocio.Observacion;
import com.ub.st.managers.commons.ManagerSQL;
import java.util.List;
import static java.util.stream.Collectors.toList;

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

    public double importePendienteAuditoria(int id) throws Exception {
        Auditoria auditoria = this.findOne(id);
        List<Observacion> observaciones = auditoria.getObservacionList();
        List<Integer> observacionesId = observaciones.stream().map( e -> e.getId()).collect(toList());
        
        //importe pendiente = importe observado - ( importe aclarado + importe recuperado)
        
        double importeObservado = observaciones.stream().mapToDouble(o -> o.getImporteObservado()).sum();
        DaoSeguimiento daoSeguimiento = new DaoSeguimiento();
        double aclaradoYRecuperado = daoSeguimiento.stream().where( e -> observacionesId.contains(e.getObservacion().getId()))
                .mapToDouble( s -> s.getImporteAclarado() + s.getImporteRecuperado()).sum();
        
        return importeObservado - aclaradoYRecuperado;                                
    }
    
}
