/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.KUCHIS.modelo.repositorio;

import com.portfolio.KUCHIS.modelo.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IPublicacionRepository extends JpaRepository<Publicacion, Long> {
   
}

