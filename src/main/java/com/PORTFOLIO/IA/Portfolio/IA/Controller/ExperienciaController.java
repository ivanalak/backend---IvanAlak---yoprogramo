/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PORTFOLIO.IA.Portfolio.IA.Controller;

import com.PORTFOLIO.IA.Portfolio.IA.Model.Experiencia;
import com.PORTFOLIO.IA.Portfolio.IA.Service.ExperienciaService;
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


@RestController
@CrossOrigin(origins= "https://portfolio---ivanalak---front.web.app")
@RequestMapping("/api")

public class ExperienciaController {
    
    
     @Autowired
    private ExperienciaService experienciaService;
    
    //listar
    
    @GetMapping("/experiencias")
    public List<Experiencia> listar(){
       return experienciaService.findAll();
    }
    
    //guardar
    
    @PostMapping ("/experiencias")
    public Experiencia guardar (@RequestBody Experiencia experiencia)
    {
        return experienciaService.save (experiencia);
    }
            
    //Get una persona
    @GetMapping("/experiencias/{Id}")
    public Experiencia getUnaExperiencia (@PathVariable Integer Id){
       
        return experienciaService.findById(Id);
    }
    
    //Modificar
    
    @PutMapping ("/experiencias/{Id}")
    
       public Experiencia modificar(@RequestBody Experiencia experiencia, @PathVariable Integer Id)
       {
         Experiencia experienciaActual = experienciaService.findById (Id);
         experienciaActual.setTipo_de_trabajo(experiencia.getTipo_de_trabajo());
         
         experienciaActual.setDescripcion(experiencia.getDescripcion ());
         
         experienciaActual.setFoto_url(experiencia.getFoto_url());
         
         return experienciaService.save(experienciaActual);
       
       }
       
       @DeleteMapping ("/experiencias/{Id}")
       
       public void eliminar(@PathVariable Integer Id)
       {
         experienciaService.delete(Id);
       }
    
    
    
    
}
