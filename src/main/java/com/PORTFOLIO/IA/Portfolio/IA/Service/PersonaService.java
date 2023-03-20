/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PORTFOLIO.IA.Portfolio.IA.Service;

import com.PORTFOLIO.IA.Portfolio.IA.Model.Persona;
import java.util.List;

public interface PersonaService {
    
    public List<Persona> findAll();
    public Persona save(Persona persona);
    public Persona findById(Integer Id);
    public void delete (Integer Id);
    
    
}
