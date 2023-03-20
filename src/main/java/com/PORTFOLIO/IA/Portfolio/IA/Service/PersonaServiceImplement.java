/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PORTFOLIO.IA.Portfolio.IA.Service;

import com.PORTFOLIO.IA.Portfolio.IA.Dao.PersonaDao;
import com.PORTFOLIO.IA.Portfolio.IA.Model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class PersonaServiceImplement implements PersonaService {
    @Autowired 
    private PersonaDao personaDao; 
    
    @Override 
    @Transactional(readOnly=true)
    public List<Persona> findAll()
    {
       return (List<Persona>)personaDao.findAll();
    
    }
     @Override 
     @Transactional(readOnly=false)
    public Persona save(Persona persona){
    
      return personaDao.save(persona);
    
    }
     @Override 
     @Transactional(readOnly=true)
    public Persona findById(Integer Id){
     
         return personaDao.findById(Id).orElse(null);
    }
     @Override 
     @Transactional(readOnly=false)
    public void delete (Integer Id){
    
        personaDao.deleteById(Id);
    }
    
}
