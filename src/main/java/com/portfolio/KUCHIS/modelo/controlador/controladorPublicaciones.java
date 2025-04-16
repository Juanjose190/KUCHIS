/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.KUCHIS.modelo.controlador;

import com.portfolio.KUCHIS.modelo.Publicacion;
import com.portfolio.KUCHIS.modelo.servicio.PublicacionServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JUAN JOSE
 */

@RestController
@RequestMapping("/publicaciones")
public class controladorPublicaciones {
    
    
    @Autowired
    private PublicacionServicio publicacionServicio; 
    
    
    @GetMapping 
    public List<Publicacion> obtenerTodasLasPublicaciones(){
        return publicacionServicio.obtenerTodasLasPublicaciones(); 
    }
    
    
    @PostMapping 
    public Publicacion crearPublicacion(@RequestBody Publicacion publicacion){
        return publicacionServicio.crearPublicacion(publicacion); 
    }
    
    
    @DeleteMapping("/{id}")
    public void eliminarPublicacion(@PathVariable Long id){
        publicacionServicio.eliminarPublicacion(id);
    }
}
