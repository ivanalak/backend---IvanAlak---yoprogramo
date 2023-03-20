/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PORTFOLIO.IA.Portfolio.IA.Service;

import com.PORTFOLIO.IA.Portfolio.IA.Dao.ProyectosDao;
import com.PORTFOLIO.IA.Portfolio.IA.Model.Proyectos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service

public class ProyectosServiceImplement implements ProyectosService{
    
    @Autowired
    private ProyectosDao proyectosDao; 
    
    @Override 
    @Transactional(readOnly=true)
    public List<Proyectos> findAll()
    {
       return (List<Proyectos>)proyectosDao.findAll();
    
    }
     @Override 
     @Transactional(readOnly=false)
    public Proyectos save(Proyectos proyectos){
    
      return proyectosDao.save(proyectos);
    
    }
     @Override 
     @Transactional(readOnly=true)
    public Proyectos findById(Integer Id){
     
         return proyectosDao.findById(Id).orElse(null);
    }
     @Override 
     @Transactional(readOnly=false)
    public void delete (Integer Id){
    
        proyectosDao.deleteById(Id);
    }
    
}
