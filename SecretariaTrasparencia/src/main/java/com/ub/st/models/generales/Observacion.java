/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.st.models.generales;

/**
 *
 * @author Ulises Beltrán Gómez --- beltrangomezulises@gmail.com
 */
public class Observacion {

    private int año;
    private int añoRevisa;
    private String auditoria;
    private int numeroObservacion;
    private float importe;
    private boolean situacionCorrectiva;
    private String situacionCorrectivaDes;
    private boolean situacionPreventiva;
    private String enteFizcalizado;
    private String descripcion;

    public Observacion() {
    }

    public Observacion(int año, int añoRevisa, int numeroObservacion, float importe, boolean situacionCorrectiva, String situacionCorrectivaDes, boolean situacionPreventiva, String enteFizcalizado, String descripcion) {
        this.año = año;
        this.añoRevisa = añoRevisa;
        this.numeroObservacion = numeroObservacion;
        this.importe = importe;
        this.situacionCorrectiva = situacionCorrectiva;
        this.situacionCorrectivaDes = situacionCorrectivaDes;
        this.situacionPreventiva = situacionPreventiva;
        this.enteFizcalizado = enteFizcalizado;
        this.descripcion = descripcion;
    }

    public String getAuditoria() {
        return auditoria;
    }

    public void setAuditoria(String auditoria) {
        this.auditoria = auditoria;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getAñoRevisa() {
        return añoRevisa;
    }

    public void setAñoRevisa(int añoRevisa) {
        this.añoRevisa = añoRevisa;
    }

    public int getNumeroObservacion() {
        return numeroObservacion;
    }

    public void setNumeroObservacion(int numeroObservacion) {
        this.numeroObservacion = numeroObservacion;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public boolean isSituacionCorrectiva() {
        return situacionCorrectiva;
    }

    public void setSituacionCorrectiva(boolean situacionCorrectiva) {
        this.situacionCorrectiva = situacionCorrectiva;
    }

    public String getSituacionCorrectivaDes() {
        return situacionCorrectivaDes;
    }

    public void setSituacionCorrectivaDes(String situacionCorrectivaDes) {
        this.situacionCorrectivaDes = situacionCorrectivaDes;
    }

    public boolean isSituacionPreventiva() {
        return situacionPreventiva;
    }

    public void setSituacionPreventiva(boolean situacionPreventiva) {
        this.situacionPreventiva = situacionPreventiva;
    }

    public String getEnteFizcalizado() {
        return enteFizcalizado;
    }

    public void setEnteFizcalizado(String enteFizcalizado) {
        this.enteFizcalizado = enteFizcalizado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
