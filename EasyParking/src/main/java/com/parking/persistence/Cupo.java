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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author yalvarez
 */
@Entity
@Table(name = "cupo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cupo.findAll", query = "SELECT c FROM Cupo c")
    , @NamedQuery(name = "Cupo.findByIdcupo", query = "SELECT c FROM Cupo c WHERE c.idcupo = :idcupo")
    , @NamedQuery(name = "Cupo.findByCarroCupo", query = "SELECT c FROM Cupo c WHERE c.carroCupo = :carroCupo")
    , @NamedQuery(name = "Cupo.findByMotoCupo", query = "SELECT c FROM Cupo c WHERE c.motoCupo = :motoCupo")
    , @NamedQuery(name = "Cupo.findByCantidadCarro", query = "SELECT c FROM Cupo c WHERE c.cantidadCarro = :cantidadCarro")
    , @NamedQuery(name = "Cupo.findByCantidadMoto", query = "SELECT c FROM Cupo c WHERE c.cantidadMoto = :cantidadMoto")})
public class Cupo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcupo")
    private Integer idcupo;
    @Column(name = "carro_cupo")
    private Integer carroCupo;
    @Column(name = "moto_cupo")
    private Integer motoCupo;
    @Column(name = "cantidad_carro")
    private Integer cantidadCarro;
    @Column(name = "cantidad_moto")
    private Integer cantidadMoto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cupoidcupo")
    private List<Parquedero> parquederoList;

    public Cupo() {
    }

    public Cupo(Integer idcupo) {
        this.idcupo = idcupo;
    }

    public Integer getIdcupo() {
        return idcupo;
    }

    public void setIdcupo(Integer idcupo) {
        this.idcupo = idcupo;
    }

    public Integer getCarroCupo() {
        return carroCupo;
    }

    public void setCarroCupo(Integer carroCupo) {
        this.carroCupo = carroCupo;
    }

    public Integer getMotoCupo() {
        return motoCupo;
    }

    public void setMotoCupo(Integer motoCupo) {
        this.motoCupo = motoCupo;
    }

    public Integer getCantidadCarro() {
        return cantidadCarro;
    }

    public void setCantidadCarro(Integer cantidadCarro) {
        this.cantidadCarro = cantidadCarro;
    }

    public Integer getCantidadMoto() {
        return cantidadMoto;
    }

    public void setCantidadMoto(Integer cantidadMoto) {
        this.cantidadMoto = cantidadMoto;
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
        hash += (idcupo != null ? idcupo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cupo)) {
            return false;
        }
        Cupo other = (Cupo) object;
        if ((this.idcupo == null && other.idcupo != null) || (this.idcupo != null && !this.idcupo.equals(other.idcupo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.parking.persistence.Cupo[ idcupo=" + idcupo + " ]";
    }
    
}
