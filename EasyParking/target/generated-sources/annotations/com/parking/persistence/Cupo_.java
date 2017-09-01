package com.parking.persistence;

import com.parking.persistence.Parquedero;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-30T15:17:32")
@StaticMetamodel(Cupo.class)
public class Cupo_ { 

    public static volatile SingularAttribute<Cupo, Integer> idcupo;
    public static volatile SingularAttribute<Cupo, Integer> cantidadCarro;
    public static volatile SingularAttribute<Cupo, Integer> carroCupo;
    public static volatile SingularAttribute<Cupo, Integer> motoCupo;
    public static volatile ListAttribute<Cupo, Parquedero> parquederoList;
    public static volatile SingularAttribute<Cupo, Integer> cantidadMoto;

}