/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PORTFOLIO.IA.Portfolio.IA.Service;

import com.PORTFOLIO.IA.Portfolio.IA.Dao.ExperienciaDao;
import com.PORTFOLIO.IA.Portfolio.IA.Model.Experiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ExperienciaServiceImplement implements ExperienciaService{
    
    @Autowired
    private ExperienciaDao experienciaDao; 
    
    @Override 
    @Transactional(readOnly=true)
    public List<Experiencia> findAll()
    {
       return (List<Experiencia>)experienciaDao.findAll();
    
    }
     @Override 
     @Transactional(readOnly=false)
    public Experiencia save(Experiencia experiencia){
    
      return experienciaDao.save(experiencia);
    
    }
     @Override 
     @Transactional(readOnly=true)
    public Experiencia findById(Integer Id){
     
         return experienciaDao.findById(Id).orElse(null);
    }
     @Override 
     @Transactional(readOnly=false)
    public void delete (Integer Id){
    
        experienciaDao.deleteById(Id);
    }

    
    
    
    
}
