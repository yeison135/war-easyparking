/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parking.persistence;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author yalvarez
 */
@Entity
@Table(name = "sitio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sitio.findAll", query = "SELECT s FROM Sitio s")
    , @NamedQuery(name = "Sitio.findByIdSitio", query = "SELECT s FROM Sitio s WHERE s.idSitio = :idSitio")
    , @NamedQuery(name = "Sitio.findByNombreParqueadero", query = "SELECT s FROM Sitio s WHERE s.nombreParqueadero = :nombreParqueadero")
    , @NamedQuery(name = "Sitio.findByDirecion", query = "SELECT s FROM Sitio s WHERE s.direcion = :direcion")
    , @NamedQuery(name = "Sitio.findByLatitud", query = "SELECT s FROM Sitio s WHERE s.latitud = :latitud")
    , @NamedQuery(name = "Sitio.findByLongitud", query = "SELECT s FROM Sitio s WHERE s.longitud = :longitud")})
public class Sitio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idSitio")
    private Integer idSitio;
    @Size(max = 45)
    @Column(name = "nombre_parqueadero")
    private String nombreParqueadero;
    @Size(max = 45)
    @Column(name = "direcion")
    private String direcion;
    @Size(max = 45)
    @Column(name = "latitud")
    private String latitud;
    @Size(max = 45)
    @Column(name = "longitud")
    private String longitud;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSitio")
    private List<Parquedero> parquederoList;

    public Sitio() {
    }

    public Sitio(Integer idSitio) {
        this.idSitio = idSitio;
    }

    public Integer getIdSitio() {
        return idSitio;
    }

    public void setIdSitio(Integer idSitio) {
        this.idSitio = idSitio;
    }

    public String getNombreParqueadero() {
        return nombreParqueadero;
    }

    public void setNombreParqueadero(String nombreParqueadero) {
        this.nombreParqueadero = nombreParqueadero;
    }

    public String getDirecion() {
        return direcion;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    @XmlTransient
    public List<Parquedero> getParquederoList() {
        return parquederoList;
    }

    public void setParquederoList(List<Parquedero> parquederoList) {
        this.parquederoList = parquederoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSitio != null ? idSitio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sitio)) {
            return false;
        }
        Sitio other = (Sitio) object;
        if ((this.idSitio == null && other.idSitio != null) || (this.idSitio != null && !this.idSitio.equals(other.idSitio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.parking.persistence.Sitio[ idSitio=" + idSitio + " ]";
    }
    
}
