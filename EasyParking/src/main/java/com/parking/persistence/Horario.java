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
@Table(name = "horario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Horario.findAll", query = "SELECT h FROM Horario h")
    , @NamedQuery(name = "Horario.findByIdHorario", query = "SELECT h FROM Horario h WHERE h.idHorario = :idHorario")
    , @NamedQuery(name = "Horario.findByLunesViernes", query = "SELECT h FROM Horario h WHERE h.lunesViernes = :lunesViernes")
    , @NamedQuery(name = "Horario.findBySabado", query = "SELECT h FROM Horario h WHERE h.sabado = :sabado")
    , @NamedQuery(name = "Horario.findByDomingoFestivo", query = "SELECT h FROM Horario h WHERE h.domingoFestivo = :domingoFestivo")})
public class Horario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idHorario")
    private Integer idHorario;
    @Size(max = 45)
    @Column(name = "lunes_viernes")
    private String lunesViernes;
    @Size(max = 45)
    @Column(name = "sabado")
    private String sabado;
    @Size(max = 45)
    @Column(name = "domingo_festivo")
    private String domingoFestivo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idHorario")
    private List<Parquedero> parquederoList;

    public Horario() {
    }

    public Horario(Integer idHorario) {
        this.idHorario = idHorario;
    }

    public Integer getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(Integer idHorario) {
        this.idHorario = idHorario;
    }

    public String getLunesViernes() {
        return lunesViernes;
    }

    public void setLunesViernes(String lunesViernes) {
        this.lunesViernes = lunesViernes;
    }

    public String getSabado() {
        return sabado;
    }

    public void setSabado(String sabado) {
        this.sabado = sabado;
    }

    public String getDomingoFestivo() {
        return domingoFestivo;
    }

    public void setDomingoFestivo(String domingoFestivo) {
        this.domingoFestivo = domingoFestivo;
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
        hash += (idHorario != null ? idHorario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Horario)) {
            return false;
        }
        Horario other = (Horario) object;
        if ((this.idHorario == null && other.idHorario != null) || (this.idHorario != null && !this.idHorario.equals(other.idHorario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.parking.persistence.Horario[ idHorario=" + idHorario + " ]";
    }
    
}
