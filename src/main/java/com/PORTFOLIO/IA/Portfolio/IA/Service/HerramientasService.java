/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PORTFOLIO.IA.Portfolio.IA.Service;

import com.PORTFOLIO.IA.Portfolio.IA.Model.Herramientas;
import java.util.List;

/**
 *
 * @author ivan_
 */
public interface HerramientasService {
    
    public List<Herramientas> findAll();
     public Herramientas save(Herramientas herramientas);
     public Herramientas findById(Integer id);
     public void delete (Integer id);
    
}
