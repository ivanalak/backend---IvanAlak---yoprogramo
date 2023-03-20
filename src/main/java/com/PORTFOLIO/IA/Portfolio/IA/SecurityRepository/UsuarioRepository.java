/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PORTFOLIO.IA.Portfolio.IA.SecurityRepository;

import com.PORTFOLIO.IA.Portfolio.IA.SecurityEntity.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ivan_
 */
@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long>{

public Usuario findByUsername(String username);


    
}

