/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.KUCHIS.modelo.controlador;

import com.portfolio.KUCHIS.modelo.Comentario;
import com.portfolio.KUCHIS.modelo.servicio.ComentarioServicio;
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
@RequestMapping("/comentarios")
public class controladorComentario {
    
    
    @Autowired
    private ComentarioServicio comentarioServicio; 
    
    
    
    @GetMapping
    public List<Comentario> obtenerComentario(){
        return comentarioServicio.obtenerComentario(); 
    }
    
    
    @PostMapping 
    public Comentario crearComentario(@RequestBody Comentario comentario){
       return comentarioServicio.crearComentario(comentario);
    }
    
    
    @DeleteMapping("/{id}")
    public void borrarComentario(@PathVariable Long id){
        comentarioServicio.borrarComentario(id); 
    }
}
