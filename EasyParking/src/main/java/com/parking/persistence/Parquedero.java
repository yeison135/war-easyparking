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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author yalvarez
 */
@Entity
@Table(name = "parquedero")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parquedero.findAll", query = "SELECT p FROM Parquedero p")
    , @NamedQuery(name = "Parquedero.findByIdParquedero", query = "SELECT p FROM Parquedero p WHERE p.idParquedero = :idParquedero")})
public class Parquedero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idParquedero")
    private Integer idParquedero;
    @JoinColumn(name = "Costo_idCosto", referencedColumnName = "idCosto")
    @ManyToOne(optional = false)
    private Costo costoidCosto;
    @JoinColumn(name = "Cupo_idcupo", referencedColumnName = "idcupo")
    @ManyToOne(optional = false)
    private Cupo cupoidcupo;
    @JoinColumn(name = "idHorario", referencedColumnName = "idHorario")
    @ManyToOne(optional = false)
    private Horario idHorario;
    @JoinColumn(name = "idSitio", referencedColumnName = "idSitio")
    @ManyToOne(optional = false)
    private Sitio idSitio;
    @OneToMany(mappedBy = "parquederoidParquedero")
    private List<Usuario> usuarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idParquedero")
    private List<Vehiculo> vehiculoList;

    public Parquedero() {
    }

    public Parquedero(Integer idParquedero) {
        this.idParquedero = idParquedero;
    }

    public Integer getIdParquedero() {
        return idParquedero;
    }

    public void setIdParquedero(Integer idParquedero) {
        this.idParquedero = idParquedero;
    }

    public Costo getCostoidCosto() {
        return costoidCosto;
    }

    public void setCostoidCosto(Costo costoidCosto) {
        this.costoidCosto = costoidCosto;
    }

    public Cupo getCupoidcupo() {
        return cupoidcupo;
    }

    public void setCupoidcupo(Cupo cupoidcupo) {
        this.cupoidcupo = cupoidcupo;
    }

    public Horario getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(Horario idHorario) {
        this.idHorario = idHorario;
    }

    public Sitio getIdSitio() {
        return idSitio;
    }

    public void setIdSitio(Sitio idSitio) {
        this.idSitio = idSitio;
    }

    @XmlTransient
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @XmlTransient
    public List<Vehiculo> getVehiculoList() {
        return vehiculoList;
    }

    public void setVehiculoList(List<Vehiculo> vehiculoList) {
        this.vehiculoList = vehiculoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idParquedero != null ? idParquedero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parquedero)) {
            return false;
        }
        Parquedero other = (Parquedero) object;
        if ((this.idParquedero == null && other.idParquedero != null) || (this.idParquedero != null && !this.idParquedero.equals(other.idParquedero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.parking.persistence.Parquedero[ idParquedero=" + idParquedero + " ]";
    }
    
}
