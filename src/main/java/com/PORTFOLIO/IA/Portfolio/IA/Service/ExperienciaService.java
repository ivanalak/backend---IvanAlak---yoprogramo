/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PORTFOLIO.IA.Portfolio.IA.Service;

import com.PORTFOLIO.IA.Portfolio.IA.Model.Experiencia;
import java.util.List;

/**
 *
 * @author ivan_
 */
public interface ExperienciaService {
    
    public List<Experiencia> findAll();
     public Experiencia save(Experiencia experiencia);
     public Experiencia findById(Integer id);
     public void delete (Integer id);
    
}
