/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PORTFOLIO.IA.Portfolio.IA.Dao; 

import com.PORTFOLIO.IA.Portfolio.IA.Model.Persona;
import org.springframework.data.repository.CrudRepository;


public interface PersonaDao extends CrudRepository <Persona, Integer> {
    
}
