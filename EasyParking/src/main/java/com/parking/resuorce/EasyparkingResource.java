/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parking.resuorce;

import com.easyparking.entitymanager.EMF;
import com.easyparking.filtroDTO.FiltroDTO;
import com.easyparking.manager.EasyParkingManager;
import com.parking.persistence.Persona;
import com.parking.persistence.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author yalvarez
 */
@Path("easyparking")
public class EasyparkingResource {

     EntityManager em = EMF.createEntityManager();
    @Context
    private UriInfo context;


    /**
     * Creates a new instance of EasyparkingResource
     */
    public EasyparkingResource() {
    }

    /**
     * Retrieves representation of an instance of com.parking.resuorce.EasyparkingResource
     * @return an instance of java.lang.String
     */
     @GET
    @Path("ConsultaPersonas")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Persona> consultarPersonas() {
        
       EasyParkingManager consultaUsuarios = new EasyParkingManager();     
       List<Persona> user = consultaUsuarios.consultar(em);
                
        return user;
    }
    
    @POST 
    @Path("ConsultaPersona")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Persona consultarPersona(FiltroDTO filtro) {
        
       EasyParkingManager manager = new EasyParkingManager();
       Persona user = new Persona();
       if(filtro.getFiltroUno()!=null){
          user = manager.consultarPersona(filtro, em);       
       }                       
        return user;
    }
    
    @POST 
    @Path("RegistrarUsuario")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Integer RegistrarUsuario(Usuario usuario) {
        
       EasyParkingManager manager = new EasyParkingManager();
       Integer registro = 0;
       if(usuario!=null){
         registro = manager.RegistrarUsuario(usuario, em);       
       }                       
        return registro;
    }
    
    @POST 
    @Path("RegistrarPersona")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Boolean RegistrarPersona(Persona persona) {
        
       EasyParkingManager manager = new EasyParkingManager();
       Boolean registro = false;
       if(persona!=null){
         registro = manager.RegistrarPersona(persona, em);       
       }                       
        return registro;
    }
    
    @POST 
    @Path("ValidarContrasena")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Boolean ValidarContrasena(FiltroDTO filtro) {
       Boolean result = false;  
       EasyParkingManager manager = new EasyParkingManager();
        if(filtro.getFiltroUno()!=null && filtro.getFiltroDos() != null){
          result = manager.ValidarContrasena(filtro, em);       
       }                       
        return result;
    }
}
