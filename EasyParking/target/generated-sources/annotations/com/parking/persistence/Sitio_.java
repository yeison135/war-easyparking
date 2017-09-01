package com.parking.persistence;

import com.parking.persistence.Parquedero;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-30T15:17:32")
@StaticMetamodel(Sitio.class)
public class Sitio_ { 

    public static volatile SingularAttribute<Sitio, String> latitud;
    public static volatile SingularAttribute<Sitio, String> longitud;
    public static volatile SingularAttribute<Sitio, String> nombreParqueadero;
    public static volatile SingularAttribute<Sitio, String> direcion;
    public static volatile ListAttribute<Sitio, Parquedero> parquederoList;
    public static volatile SingularAttribute<Sitio, Integer> idSitio;

}