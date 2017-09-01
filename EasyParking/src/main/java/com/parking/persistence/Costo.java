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
@Table(name = "costo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Costo.findAll", query = "SELECT c FROM Costo c")
    , @NamedQuery(name = "Costo.findByIdCosto", query = "SELECT c FROM Costo c WHERE c.idCosto = :idCosto")
    , @NamedQuery(name = "Costo.findByMinutoCarro", query = "SELECT c FROM Costo c WHERE c.minutoCarro = :minutoCarro")
    , @NamedQuery(name = "Costo.findByMinutoMoto", query = "SELECT c FROM Costo c WHERE c.minutoMoto = :minutoMoto")
    , @NamedQuery(name = "Costo.findByHoraCarro", query = "SELECT c FROM Costo c WHERE c.horaCarro = :horaCarro")
    , @NamedQuery(name = "Costo.findByHoraMoto", query = "SELECT c FROM Costo c WHERE c.horaMoto = :horaMoto")
    , @NamedQuery(name = "Costo.findByTplenaCarro", query = "SELECT c FROM Costo c WHERE c.tplenaCarro = :tplenaCarro")
    , @NamedQuery(name = "Costo.findByTplenaMoto", query = "SELECT c FROM Costo c WHERE c.tplenaMoto = :tplenaMoto")})
public class Costo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCosto")
    private Integer idCosto;
    @Size(max = 45)
    @Column(name = "minuto_carro")
    private String minutoCarro;
    @Size(max = 45)
    @Column(name = "minuto_moto")
    private String minutoMoto;
    @Size(max = 45)
    @Column(name = "hora_carro")
    private String horaCarro;
    @Size(max = 45)
    @Column(name = "hora_moto")
    private String horaMoto;
    @Size(max = 45)
    @Column(name = "tplena_carro")
    private String tplenaCarro;
    @Size(max = 45)
    @Column(name = "tplena_moto")
    private String tplenaMoto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "costoidCosto")
    private List<Parquedero> parquederoList;

    public Costo() {
    }

    public Costo(Integer idCosto) {
        this.idCosto = idCosto;
    }

    public Integer getIdCosto() {
        return idCosto;
    }

    public void setIdCosto(Integer idCosto) {
        this.idCosto = idCosto;
    }

    public String getMinutoCarro() {
        return minutoCarro;
    }

    public void setMinutoCarro(String minutoCarro) {
        this.minutoCarro = minutoCarro;
    }

    public String getMinutoMoto() {
        return minutoMoto;
    }

    public void setMinutoMoto(String minutoMoto) {
        this.minutoMoto = minutoMoto;
    }

    public String getHoraCarro() {
        return horaCarro;
    }

    public void setHoraCarro(String horaCarro) {
        this.horaCarro = horaCarro;
    }

    public String getHoraMoto() {
        return horaMoto;
    }

    public void setHoraMoto(String horaMoto) {
        this.horaMoto = horaMoto;
    }

    public String getTplenaCarro() {
        return tplenaCarro;
    }

    public void setTplenaCarro(String tplenaCarro) {
        this.tplenaCarro = tplenaCarro;
    }

    public String getTplenaMoto() {
        return tplenaMoto;
    }

    public void setTplenaMoto(String tplenaMoto) {
        this.tplenaMoto = tplenaMoto;
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
        hash += (idCosto != null ? idCosto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Costo)) {
            return false;
        }
        Costo other = (Costo) object;
        if ((this.idCosto == null && other.idCosto != null) || (this.idCosto != null && !this.idCosto.equals(other.idCosto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.parking.persistence.Costo[ idCosto=" + idCosto + " ]";
    }
    
}
