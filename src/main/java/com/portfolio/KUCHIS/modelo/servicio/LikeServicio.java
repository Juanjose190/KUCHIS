/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.KUCHIS.modelo.servicio;

import com.portfolio.KUCHIS.modelo.Like;
import com.portfolio.KUCHIS.modelo.repositorio.ILike;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JUAN JOSE
 */
@Service
public class LikeServicio {
    
        @Autowired
        private ILike repositorylike;
        
        
        //obtener los likes
        public List<Like> obtenerLikes(){
        return repositorylike.findAll(); 
        }
        
        
        //dar comentario 
        public Like darLike(Like like){
        return repositorylike.save(like);
}

        
        
        //eliminar like
        public void eliminarLike(Long id){
         repositorylike.deleteById(id);
        }
        
        
        public Like buscarPorId (Long id){
        return repositorylike.findById(id).orElse(null);
        }
}
