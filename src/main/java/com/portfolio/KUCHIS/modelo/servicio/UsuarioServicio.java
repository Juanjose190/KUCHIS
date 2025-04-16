/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.KUCHIS.modelo.servicio;

import com.portfolio.KUCHIS.modelo.Usuario;
import com.portfolio.KUCHIS.modelo.repositorio.IUsuarioRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JUAN JOSE
 */

@Service
public class UsuarioServicio {
    
    @Autowired
    private IUsuarioRepositorio usuarioRepositorio; 
    
    
    //obtener todos los usuarios
    public List<Usuario> obtenerUsuarios(){
        return usuarioRepositorio.findAll(); 
    }
    
    
    //crear usuario
    public Usuario crearUsuario(Usuario usuario){
        return usuarioRepositorio.save(usuario); 
    }
    
    
    //eliminar usuario 
    public void eliminarUsuario(Long id){
        usuarioRepositorio.deleteById(id); 
    }
    
    //buscar usuario por id 
    public Usuario buscarUsuario(Long id){
        return usuarioRepositorio.findById(id).orElse(null); 
    }
}
