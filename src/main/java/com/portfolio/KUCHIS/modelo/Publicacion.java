/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.KUCHIS.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author JUAN JOSE
 */

@Entity 
@Table(name = "publicaciones")
public class Publicacion {
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id; 
   private String contenido;
   private LocalDateTime fechaCreacion; 
   
   
   @ManyToOne
   @JoinColumn(name = "usuario_id")
   private Usuario usuario; 
   
   @OneToMany(mappedBy = "publicacion", cascade = CascadeType.ALL, orphanRemoval = true)
   private List<Comentario> comentarios; 
   
   
   @OneToMany(mappedBy = "publicacion", cascade = CascadeType.ALL, orphanRemoval = true)
   private List<Like> likes;  
   
   
   
   //constructor vacío
   public Publicacion(){
       this.fechaCreacion = LocalDateTime.now(); 
   }; 
   
   
   //get and set

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }
   
   
   
}
