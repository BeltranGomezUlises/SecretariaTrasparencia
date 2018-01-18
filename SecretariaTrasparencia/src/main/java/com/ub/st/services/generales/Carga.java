/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.st.services.generales;

import com.ub.st.daos.negocio.DaoAreaFiscalizadora;
import com.ub.st.daos.negocio.DaoAuditoria;
import com.ub.st.daos.negocio.DaoEnteFiscalizado;
import com.ub.st.daos.negocio.DaoObervacion;
import com.ub.st.entities.negocio.Auditoria;
import com.ub.st.entities.negocio.EnteFiscalizado;
import com.ub.st.models.generales.Observacion;
import com.ub.st.utils.UtilsService;
import com.ub.st.utils.responses.Response;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Ulises Beltrán Gómez --- beltrangomezulises@gmail.com
 */
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/carga")
public class Carga {
    
    @POST
    @Path("/observaciones")
    public Response<String> carga (List<Observacion> observaciones){
        Response r = new Response();                
        try {                                                
            final DaoAuditoria daoAuditoria = new DaoAuditoria();
            final DaoEnteFiscalizado daoEnteFiscalizado = new DaoEnteFiscalizado();
            final DaoAreaFiscalizadora daoAreaFiscalizadora = new DaoAreaFiscalizadora();
            final DaoObervacion daoObervacion = new DaoObervacion();
            
            Map<String, List<Observacion>> map = observaciones.stream().collect(Collectors.groupingBy(Observacion::getAuditoria));
            Set<Observacion> auditorias = observaciones.stream().collect(toSet());
            
            for (Observacion ob: auditorias) {                
                Auditoria au = new Auditoria();
                au.setAnioRealiza( ob.getAnio());
                au.setAnioRevisa( ob.getAnioRevisa());
                au.setNombre(ob.getAuditoria()); 
                au.setSituacionActual("carga desde excel");
                
                //existe el ente, si no crealo
                EnteFiscalizado ente;
                try {
                    String enteFiscalizado = ob.getEnteFizcalizado();
                    ente = daoEnteFiscalizado.stream().where( e -> e.getNombre().equals(enteFiscalizado)).findFirst().get();
                } catch (Exception e) {
                    ente = new EnteFiscalizado(ob.getEnteFizcalizado());
                    try {
                        daoEnteFiscalizado.persist(ente);
                    } catch (Exception ex) {
                        Logger.getLogger(Carga.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }                                                
                au.setEnteFiscalizadoList(Arrays.asList(ente));
                
                //colocar el area fiscalizadora
                try {
                    au.setAreaFiscalizadoraList(Arrays.asList(daoAreaFiscalizadora.findFirst()));
                } catch (Exception ex) {
                    Logger.getLogger(Carga.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    //guardar la auditoria
                    daoAuditoria.persist(au);
                    List<Observacion> observacionesDeAuditoria = observaciones.stream().filter( o -> o.equals(ob)).collect(toList());                    
                    for (Observacion observacion : observacionesDeAuditoria) {
                        com.ub.st.entities.negocio.Observacion obser = new com.ub.st.entities.negocio.Observacion();
                        obser.setAuditoria(au);
                        obser.setNumeroObservacion(String.valueOf(observacion.getNumeroObservacion()));
                        obser.setImporteObservado(observacion.getImporte());
                        obser.setRecomendacionCorrectiva(observacion.isSituacionCorrectiva());
                        obser.setRecomendacionPreventiva(observacion.isSituacionPreventiva());
                        obser.setDesRecomendacionCorrectiva(observacion.getSituacionCorrectivaDes());
                        obser.setDescripcion(observacion.getDescripcion());
                        obser.setDesRecomendacionPreventiva("");
                        obser.setPendiente("");
                            
                        daoObervacion.persist(obser);
                    }                                       
                } catch (Exception ex) {
                    Logger.getLogger(Carga.class.getName()).log(Level.SEVERE, null, ex);
                }                                                                                
            }                            
        } catch (Exception e) {
            Logger.getLogger(Carga.class.getName()).log(Level.SEVERE, null, e);
            UtilsService.setErrorResponse(r, e);
        }        
        return r;        
    }    
    
}
