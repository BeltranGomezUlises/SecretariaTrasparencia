/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.st.services.negocio;

import com.ub.st.entities.negocio.EnteFiscalizador;
import com.ub.st.managers.negocio.ManagerEnteFiscalizador;
import com.ub.st.models.negocio.ModelImportePendiente;
import com.ub.st.services.commons.ServiceFacade;
import com.ub.st.utils.UtilsService;
import com.ub.st.utils.exceptions.TokenExpiradoException;
import com.ub.st.utils.exceptions.TokenInvalidoException;
import com.ub.st.utils.responses.Response;
import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;

/**
 * servicios lcrud para entes fiscalizadores
 *
 * @author Ulises Beltrán Gómez --- beltrangomezulises@gmail.com
 */
@Path("/entesFiscalizadores")
public class EntesFiscalizadores extends ServiceFacade<ManagerEnteFiscalizador, EnteFiscalizador, Integer> {

    public EntesFiscalizadores() {
        super(ManagerEnteFiscalizador.class);
    }

    @GET
    @Path("/importes")
    public Response<Map<Integer, ModelImportePendiente>> importesPendientesPorEnteFiscalizador(@HeaderParam("Authorization") final String token) {
        Response<Map<Integer, ModelImportePendiente>> res = new Response<>();
        try {
            ManagerEnteFiscalizador managerEnteFiscalizador = new ManagerEnteFiscalizador();
            managerEnteFiscalizador.setToken(token);
            UtilsService.setOkResponse(res, managerEnteFiscalizador.importesPendientesPorEnteFiscalizador(), "Importes por ente finscalizar");
        } catch (TokenExpiradoException | TokenInvalidoException e) {
            UtilsService.setInvalidTokenResponse(res);
        } catch (Exception e) {
            UtilsService.setErrorResponse(res, e);
        }
        return res;
    }

}
