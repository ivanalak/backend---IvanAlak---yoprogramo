/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PORTFOLIO.IA.Portfolio.IA.Controller;

import com.PORTFOLIO.IA.Portfolio.IA.Model.Educacion;
import com.PORTFOLIO.IA.Portfolio.IA.Service.EducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author ivan_
 */
@RestController
@CrossOrigin(origins= "https://portfolio---ivanalak---front.web.app")
@RequestMapping("/api")

public class EducacionController {
    
     @Autowired
    private EducacionService educacionService;
    
    //listar
    
    @GetMapping("/educacions")
    public List<Educacion> listar(){
       return educacionService.findAll();
    }
    
    //guardar
    
    @PostMapping ("/educacions")
    public Educacion guardar (@RequestBody Educacion educacion)
    {
        return educacionService.save (educacion);
    }
            
    //Get una persona
    @GetMapping("/educacions/{Id}")
    public Educacion getUnaEducacion (@PathVariable Integer Id){
       
        return educacionService.findById(Id);
    }
    
    //Modificar
    
    @PutMapping ("/educacions/{Id}")
    
       public Educacion modificar(@RequestBody Educacion educacion, @PathVariable Integer Id)
       {
         Educacion educacionActual = educacionService.findById (Id);
         
         educacionActual.setTipo_de_educacion(educacion.getTipo_de_educacion());
         
         educacionActual.setDescripcion(educacion.getDescripcion ());
         
         educacionActual.setFoto_url(educacion.getFoto_url());
         
         return educacionService.save(educacionActual);
       
       }
       
       @DeleteMapping ("/educacions/{Id}")
       
       public void eliminar(@PathVariable Integer Id)
       {
         educacionService.delete(Id);
       }
    
}
