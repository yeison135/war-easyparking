package com.parking.persistence;

import com.parking.persistence.Parquedero;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-30T15:17:32")
@StaticMetamodel(Horario.class)
public class Horario_ { 

    public static volatile SingularAttribute<Horario, Integer> idHorario;
    public static volatile SingularAttribute<Horario, String> domingoFestivo;
    public static volatile SingularAttribute<Horario, String> sabado;
    public static volatile ListAttribute<Horario, Parquedero> parquederoList;
    public static volatile SingularAttribute<Horario, String> lunesViernes;

}