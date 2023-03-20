/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PORTFOLIO.IA.Portfolio.IA.Service;

import com.PORTFOLIO.IA.Portfolio.IA.Model.Proyectos;
import java.util.List;

/**
 *
 * @author ivan_
 */
public interface ProyectosService {
    
    public List<Proyectos> findAll();
     public Proyectos save(Proyectos proyectos);
     public Proyectos findById(Integer id);
     public void delete (Integer id);
    
    
}
