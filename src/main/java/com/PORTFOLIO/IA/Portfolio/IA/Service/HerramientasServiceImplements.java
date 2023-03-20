/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PORTFOLIO.IA.Portfolio.IA.Service;

import com.PORTFOLIO.IA.Portfolio.IA.Dao.HerramientasDao;
import com.PORTFOLIO.IA.Portfolio.IA.Model.Herramientas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HerramientasServiceImplements implements HerramientasService{
    
    @Autowired
    private HerramientasDao herramientasDao; 
    
    @Override 
    @Transactional(readOnly=true)
    public List<Herramientas> findAll()
    {
       return (List<Herramientas>)herramientasDao.findAll();
    
    }
     @Override 
     @Transactional(readOnly=false)
    public Herramientas save(Herramientas herramientas){
    
      return herramientasDao.save(herramientas);
    
    }
     @Override 
     @Transactional(readOnly=true)
    public Herramientas findById(Integer Id){
     
         return herramientasDao.findById(Id).orElse(null);
    }
     @Override 
     @Transactional(readOnly=false)
    public void delete (Integer Id){
    
        herramientasDao.deleteById(Id);
    }

    
    
}
