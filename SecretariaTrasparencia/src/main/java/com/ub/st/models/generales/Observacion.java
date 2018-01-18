/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.st.models.generales;

import java.util.Objects;

/**
 *
 * @author Ulises Beltrán Gómez --- beltrangomezulises@gmail.com
 */
public class Observacion {

    private int anio;
    private int anioRevisa;
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

    public Observacion(int anio, int anioRevisa, int numeroObservacion, float importe, boolean situacionCorrectiva, String situacionCorrectivaDes, boolean situacionPreventiva, String enteFizcalizado, String descripcion) {
        this.anio = anio;
        this.anioRevisa = anioRevisa;
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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getAnioRevisa() {
        return anioRevisa;
    }

    public void setAnioRevisa(int anioRevisa) {
        this.anioRevisa = anioRevisa;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.auditoria);
        hash = 47 * hash + Objects.hashCode(this.enteFizcalizado);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Observacion other = (Observacion) obj;
        if (!Objects.equals(this.auditoria, other.auditoria)) {
            return false;
        }
        if (!Objects.equals(this.enteFizcalizado, other.enteFizcalizado)) {
            return false;
        }
        return true;
    }

    
}
