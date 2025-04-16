/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.KUCHIS.modelo.controlador;

import com.portfolio.KUCHIS.modelo.Like;
import com.portfolio.KUCHIS.modelo.servicio.LikeServicio;
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
@RequestMapping("/Likes")
public class controladorLike {
    
    
    @Autowired 
    private LikeServicio servicioLike; 
    
    
    @GetMapping 
    public List<Like> obtenerLikes(){
        return servicioLike.obtenerLikes(); 
    }
    
    
    @PostMapping
    public Like darLike(@RequestBody Like like){
        return servicioLike.darLike(like); 
    }
    
    @DeleteMapping("/{id}")
    public void eliminarLike(@PathVariable Long id){
        servicioLike.eliminarLike(id); 
    }
}
