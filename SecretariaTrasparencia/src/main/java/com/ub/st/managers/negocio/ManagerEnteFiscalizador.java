/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.st.managers.negocio;

import com.ub.st.daos.negocio.DaoEnteFilcalizador;
import com.ub.st.entities.negocio.AreaFiscalizadora;
import com.ub.st.entities.negocio.Auditoria;
import com.ub.st.entities.negocio.EnteFiscalizador;
import com.ub.st.entities.negocio.Observacion;
import com.ub.st.entities.negocio.Seguimiento;
import com.ub.st.managers.commons.ManagerSQL;
import com.ub.st.models.negocio.ModelImportePendiente;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public Map<Integer, ModelImportePendiente> importesPendientesPorEnteFiscalizador() throws Exception {        
        List<EnteFiscalizador> entesFiscalizadores = this.findAll();
        Map<Integer, ModelImportePendiente> res = new HashMap<>();
        ModelImportePendiente importePendiente;
        double importeObservado, importeAclarado, importeRecuperado;
        for (EnteFiscalizador ente : entesFiscalizadores) {
            importePendiente = new ModelImportePendiente();
            importeObservado = 0;
            importeAclarado = 0;
            importeRecuperado = 0;
            for (AreaFiscalizadora area : ente.getAreaFiscalizadoraList()) {
                for (Auditoria auditoria : area.getAuditoriaList()) {
                    for (Observacion observacion : auditoria.getObservacionList()) {
                        importeObservado += observacion.getImporteObservado();
                        for (Seguimiento seguimiento : observacion.getSeguimientoList()) {
                            importeAclarado += seguimiento.getImporteAclarado();
                            importeRecuperado += seguimiento.getImporteRecuperado();
                        }
                    }
                }
            }
            importePendiente.setImporteAclarado(importeAclarado);
            importePendiente.setImporteRecuperado(importeRecuperado);
            importePendiente.setImporteObservado(importeObservado);
            importePendiente.setImportePendiente(importeObservado - (importeAclarado + importeRecuperado));
            res.put(ente.getId(), importePendiente);
        }
        return res;
    }

}
