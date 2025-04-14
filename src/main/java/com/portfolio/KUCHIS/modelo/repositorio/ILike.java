/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.KUCHIS.modelo.repositorio;

import com.portfolio.KUCHIS.modelo.Like;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author JUAN JOSE
 */
public interface ILike extends JpaRepository<Like, Long> {
    
}
