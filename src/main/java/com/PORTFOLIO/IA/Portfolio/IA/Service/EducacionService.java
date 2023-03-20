/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PORTFOLIO.IA.Portfolio.IA.Service;

import com.PORTFOLIO.IA.Portfolio.IA.Model.Educacion;
import java.util.List;

/**
 *
 * @author ivan_
 */
public interface EducacionService {
     public List<Educacion> findAll();
     public Educacion save(Educacion educacion);
     public Educacion findById(Integer id);
     public void delete (Integer id);
    
}
