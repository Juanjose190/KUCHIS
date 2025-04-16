/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.KUCHIS.modelo.controlador;

import com.portfolio.KUCHIS.modelo.Usuario;
import com.portfolio.KUCHIS.modelo.servicio.UsuarioServicio;
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
@RequestMapping("/usuarios")
public class usuarioControlador {
    
    
    @Autowired 
    private UsuarioServicio usuarioServicio; 
    
    
    
    @GetMapping 
    public List<Usuario> obtenerUsuarios(){
        return usuarioServicio.obtenerUsuarios();
    }
    
    
    @PostMapping 
    public Usuario crearUsuario(@RequestBody Usuario usuario){
        return usuarioServicio.crearUsuario(usuario); 
    }
    
    
    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable Long id){
        usuarioServicio.eliminarUsuario(id);
    }
}
