/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.KUCHIS.modelo.servicio;

import com.portfolio.KUCHIS.modelo.Publicacion;
import com.portfolio.KUCHIS.modelo.repositorio.IPublicacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JUAN JOSE
 */
@Service
public class PublicacionServicio {
    
    @Autowired
    private IPublicacionRepository publicacionRepository; 
    
    //mostrar Publicaciones
    public List<Publicacion> obtenerTodasLasPublicaciones(){
    return publicacionRepository.findAll(); 
    }
    
    //eliminar publicaciones
    public void eliminarPublicacion(long id){
     publicacionRepository.deleteById(id);
    }
    
    //crear publicaciones
    public Publicacion crearPublicacion(Publicacion publicacion) {
        return publicacionRepository.save(publicacion);
    }
    
    
}
