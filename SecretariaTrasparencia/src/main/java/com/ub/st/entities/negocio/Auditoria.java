/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.st.entities.negocio;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ub.st.entities.commons.EntitySQL;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Ulises Beltrán Gómez --- beltrangomezulises@gmail.com
 */
@Entity
@Cacheable(false)
@Table(name = "auditoria")
public class Auditoria extends EntitySQL<Integer> implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "a\u00f1o_realiza")
    private int añoRealiza;
    @Basic(optional = false)
    @NotNull
    @Column(name = "a\u00f1o_revisa")
    private int añoRevisa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "situacion_actual")
    private String situacionActual;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero")
    private String numero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "objetivos")
    private String objetivos;
    @JoinTable(name = "auditorias_entes_filcalizados", joinColumns = {
        @JoinColumn(name = "auditoria", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "ente_fiscalizado", referencedColumnName = "id")})
    @ManyToMany(fetch = FetchType.EAGER)
    private List<EnteFiscalizado> enteFiscalizadoList;
    @JoinTable(name = "auditorias_areas_fiscalizadoras", joinColumns = {
        @JoinColumn(name = "auditoria", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "area_fiscalizadora", referencedColumnName = "id")})
    @ManyToMany(fetch = FetchType.EAGER)
    private List<AreaFiscalizadora> areaFiscalizadoraList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "auditoria", fetch = FetchType.EAGER)
    private List<Observacion> observacionList;

    public Auditoria() {
    }

    public Auditoria(Integer id) {
        this.id = id;
    }

    public Auditoria(Integer id, int añoRealiza, int añoRevisa, String situacionActual, String numero, String nombre, String descripcion, String objetivos) {
        this.id = id;
        this.añoRealiza = añoRealiza;
        this.añoRevisa = añoRevisa;
        this.situacionActual = situacionActual;
        this.numero = numero;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.objetivos = objetivos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAñoRealiza() {
        return añoRealiza;
    }

    public void setAñoRealiza(int añoRealiza) {
        this.añoRealiza = añoRealiza;
    }

    public int getAñoRevisa() {
        return añoRevisa;
    }

    public void setAñoRevisa(int añoRevisa) {
        this.añoRevisa = añoRevisa;
    }

    public String getSituacionActual() {
        return situacionActual;
    }

    public void setSituacionActual(String situacionActual) {
        this.situacionActual = situacionActual;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public List<EnteFiscalizado> getEnteFiscalizadoList() {
        return enteFiscalizadoList;
    }

    public void setEnteFiscalizadoList(List<EnteFiscalizado> enteFiscalizadoList) {
        this.enteFiscalizadoList = enteFiscalizadoList;
    }

    public List<AreaFiscalizadora> getAreaFiscalizadoraList() {
        return areaFiscalizadoraList;
    }

    public void setAreaFiscalizadoraList(List<AreaFiscalizadora> areaFiscalizadoraList) {
        this.areaFiscalizadoraList = areaFiscalizadoraList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Auditoria)) {
            return false;
        }
        Auditoria other = (Auditoria) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ub.st.entities.negocio.Auditoria[ id=" + id + " ]";
    }

    @Override
    public Integer obtenIdEntidad() {
        return id;
    }

    @JsonIgnore
    public List<Observacion> getObservacionList() {
        return observacionList;
    }

    public void setObservacionList(List<Observacion> observacionList) {
        this.observacionList = observacionList;
    }

}
