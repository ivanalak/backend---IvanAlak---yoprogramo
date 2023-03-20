/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PORTFOLIO.IA.Portfolio.IA.SecurityRepository;

import com.PORTFOLIO.IA.Portfolio.IA.SecurityEntity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ivan_
 */
public interface RolRepository extends JpaRepository<Rol, Long> {
    
}
