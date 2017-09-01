package com.parking.persistence;

import com.parking.persistence.Parquedero;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-30T15:17:32")
@StaticMetamodel(Costo.class)
public class Costo_ { 

    public static volatile SingularAttribute<Costo, Integer> idCosto;
    public static volatile SingularAttribute<Costo, String> tplenaCarro;
    public static volatile SingularAttribute<Costo, String> horaCarro;
    public static volatile SingularAttribute<Costo, String> horaMoto;
    public static volatile SingularAttribute<Costo, String> minutoCarro;
    public static volatile SingularAttribute<Costo, String> tplenaMoto;
    public static volatile ListAttribute<Costo, Parquedero> parquederoList;
    public static volatile SingularAttribute<Costo, String> minutoMoto;

}