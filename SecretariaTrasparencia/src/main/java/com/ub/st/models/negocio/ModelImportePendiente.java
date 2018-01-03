/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.st.models.negocio;

/**
 *
 * @author Ulises Beltrán Gómez --- beltrangomezulises@gmail.com
 */
public class ModelImportePendiente {

    private double importePendiente;
    private double importeObservado;
    private double importeRecuperado;
    private double importeAclarado;

    public ModelImportePendiente() {
    }

    public ModelImportePendiente(double importePendiente) {
        this.importePendiente = importePendiente;
    }

    public double getImporteObservado() {
        return importeObservado;
    }

    public void setImporteObservado(double importeObservado) {
        this.importeObservado = importeObservado;
    }

    public double getImporteRecuperado() {
        return importeRecuperado;
    }

    public void setImporteRecuperado(double importeRecuperado) {
        this.importeRecuperado = importeRecuperado;
    }

    public double getImporteAclarado() {
        return importeAclarado;
    }

    public void setImporteAclarado(double importeAclarado) {
        this.importeAclarado = importeAclarado;
    }

    public double getImportePendiente() {
        return importePendiente;
    }

    public void setImportePendiente(double importePendiente) {
        this.importePendiente = importePendiente;
    }

    @Override
    public String toString() {
        return "ModelImportePendiente{" + "importePendiente=" + importePendiente + '}';
    }

}
