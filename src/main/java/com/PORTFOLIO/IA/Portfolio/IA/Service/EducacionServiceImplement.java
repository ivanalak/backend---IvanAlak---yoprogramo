/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PORTFOLIO.IA.Portfolio.IA.Service;

import com.PORTFOLIO.IA.Portfolio.IA.Dao.EducacionDao;
import com.PORTFOLIO.IA.Portfolio.IA.Model.Educacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class EducacionServiceImplement implements EducacionService{
    
    @Autowired
    private EducacionDao educacionDao; 
    
    @Override 
    @Transactional(readOnly=true)
    public List<Educacion> findAll()
    {
       return (List<Educacion>)educacionDao.findAll();
    
    }
     @Override 
     @Transactional(readOnly=false)
    public Educacion save(Educacion educacion){
    
      return educacionDao.save(educacion);
    
    }
     @Override 
     @Transactional(readOnly=true)
    public Educacion findById(Integer Id){
     
         return educacionDao.findById(Id).orElse(null);
    }
     @Override 
     @Transactional(readOnly=false)
    public void delete (Integer Id){
    
        educacionDao.deleteById(Id);
    }

    
    
}
