package com.parking.persistence;

import com.parking.persistence.Costo;
import com.parking.persistence.Cupo;
import com.parking.persistence.Horario;
import com.parking.persistence.Sitio;
import com.parking.persistence.Usuario;
import com.parking.persistence.Vehiculo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-30T15:17:32")
@StaticMetamodel(Parquedero.class)
public class Parquedero_ { 

    public static volatile SingularAttribute<Parquedero, Horario> idHorario;
    public static volatile SingularAttribute<Parquedero, Costo> costoidCosto;
    public static volatile ListAttribute<Parquedero, Usuario> usuarioList;
    public static volatile SingularAttribute<Parquedero, Integer> idParquedero;
    public static volatile SingularAttribute<Parquedero, Cupo> cupoidcupo;
    public static volatile ListAttribute<Parquedero, Vehiculo> vehiculoList;
    public static volatile SingularAttribute<Parquedero, Sitio> idSitio;

}