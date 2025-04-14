/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.KUCHIS.modelo.servicio;

import com.portfolio.KUCHIS.modelo.Comentario;
import com.portfolio.KUCHIS.modelo.Publicacion;
import com.portfolio.KUCHIS.modelo.repositorio.IComentarioRepository;
import com.portfolio.KUCHIS.modelo.repositorio.ILike;
import com.portfolio.KUCHIS.modelo.repositorio.IPublicacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JUAN JOSE
 */

@Service
public class ComentarioServicio {
    
    
    @Autowired
    private IComentarioRepository comentarioRepository; 
    
   
    //mostrar los comentarios
    public List<Comentario> obtenerComentario (){
     return comentarioRepository.findAll(); 
    }
 
    
    //crear comentario
    
    public Comentario crearComentario (Comentario comentario){
    return comentarioRepository.save(comentario); 
    }
    
    
    //eliminar comentario
    
    public void  borrarComentario (Long id){
    comentarioRepository.deleteById(id);
    }
    
    
    //obetener comentario por id 
    
    public Comentario obtenerComentarioPorId (Long id){
    return comentarioRepository.findById(id).orElse(null); 
    }
}
