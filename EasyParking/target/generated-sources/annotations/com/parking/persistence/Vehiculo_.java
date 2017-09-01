package com.parking.persistence;

import com.parking.persistence.Parquedero;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-30T15:17:32")
@StaticMetamodel(Vehiculo.class)
public class Vehiculo_ { 

    public static volatile SingularAttribute<Vehiculo, Date> fecha;
    public static volatile SingularAttribute<Vehiculo, String> tipo;
    public static volatile SingularAttribute<Vehiculo, Integer> idVehiculo;
    public static volatile SingularAttribute<Vehiculo, Parquedero> idParquedero;
    public static volatile SingularAttribute<Vehiculo, String> matricula;

}