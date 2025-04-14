/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.KUCHIS.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

/**
 *
 * @author JUAN JOSE
 */
@Entity
@Table(name = "likes")
public class Like {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    private long id; 
    
    private LocalDateTime fecha; 
    
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
            
            
   @ManyToOne
   @JoinColumn(name = "publicacion_id")
   private Publicacion publicacion; 
   
   
   //constructor vacío
   public Like(){}
   
   
   //constructor 
   public Like(Usuario usuario, Publicacion publicacion, LocalDateTime fecha){
   this.usuario = usuario; 
   this.publicacion = publicacion; 
   this.fecha = fecha; 
   }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }
   
   
   
}
