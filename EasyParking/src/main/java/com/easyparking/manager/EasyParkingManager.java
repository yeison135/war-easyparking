/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easyparking.manager;

import com.easyparking.filtroDTO.FiltroDTO;
import com.parking.persistence.Cupo;
import com.parking.persistence.Persona;
import com.parking.persistence.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author yalvarez
 */
public class EasyParkingManager {

    public List<Persona> consultar(EntityManager em) {
        Query consulta = em.createNamedQuery("Persona.findAll");
        List<Persona> Personas = consulta.getResultList();
        return Personas;
    }

    public Persona consultarPersona(FiltroDTO filtro, EntityManager em) {
        StringBuilder queryString = new StringBuilder();
        queryString.append("SELECT p FROM Persona p WHERE p.nombre =:nombre");
        Query query = em.createQuery(queryString.toString());
        if (filtro.getFiltroUno() != null) {
            query.setParameter("nombre", filtro.getFiltroUno());
        }
        Persona persona = (Persona) query.getSingleResult();

        return persona;
    }

    public Integer RegistrarUsuario(Usuario usuario, EntityManager em) {
        Integer registro;
        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();
        registro = usuario.getIdUsuario();
        return registro;
    }
    public Boolean RegistrarPersona(Persona persona, EntityManager em) {
        boolean registro = true;
        em.getTransaction().begin();
        em.persist(persona);
        em.getTransaction().commit();
        return registro;
    }
    public Boolean ValidarContrasena(FiltroDTO filtro, EntityManager em) {
        StringBuilder queryString = new StringBuilder();
        queryString.append("SELECT u FROM Usuario u WHERE u.contrasena =:contrasena "
                + "AND u.usuario=:usuario");
        Query query = em.createQuery(queryString.toString());
        if (filtro.getFiltroUno() != null && filtro.getFiltroDos() != null) {
            query.setParameter("contrasena", filtro.getFiltroUno());
            query.setParameter("usuario", filtro.getFiltroDos());
        }
        Boolean result = false;
        Usuario usuario = new Usuario();
        try {
         usuario =  (Usuario) query.getSingleResult(); 
         } catch (Exception e) {
          result = false;  
        }
        
        if(usuario.getIdUsuario() != null){
            result = true;
        }
        return result;
    }
    
    public Boolean RegistrarCupo(Cupo cupo, EntityManager em) {
        boolean registro = true;
        em.getTransaction().begin();
        em.persist(cupo);
        em.getTransaction().commit();
        return registro;
    }
    
    
    
}
