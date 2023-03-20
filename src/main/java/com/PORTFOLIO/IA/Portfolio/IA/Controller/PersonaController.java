/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PORTFOLIO.IA.Portfolio.IA.Controller;

import com.PORTFOLIO.IA.Portfolio.IA.Model.Persona;
import com.PORTFOLIO.IA.Portfolio.IA.Service.PersonaService;
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
@CrossOrigin(origins= "*")
@RequestMapping("/api")
public class PersonaController {
    
    @Autowired
    private PersonaService personaService;
    
    //listar
    
    @GetMapping("/personas")
    public List<Persona> listar(){
       return personaService.findAll();
    }
    
    //guardar
    
    @PostMapping ("/personas")
    public Persona guardar (@RequestBody Persona persona)
    {
        return personaService.save (persona);
    }
            
    //Get una persona
    @GetMapping("/personas/{Id}")
    public Persona getUnaPersona (@PathVariable Integer Id){
       
        return personaService.findById(Id);
    }
    
    //Modificar
    
    @PutMapping ("/personas/{Id}")
    
       public Persona modificar(@RequestBody Persona persona, @PathVariable Integer Id)
       {
         Persona personaActual = personaService.findById (Id);
         personaActual.setNombre(persona.getNombre());
         
         personaActual.setApellido(persona.getApellido ());
         
         personaActual.setMail(persona.getMail());
         
         personaActual.setFinalizado(persona.getFinalizado());
         
         personaActual.setSobre_mi(persona.getSobre_mi());
         
         personaActual.setTitulo(persona.getTitulo());
         
         personaActual.setFoto_url(persona.getFoto_url());
         
         return personaService.save(personaActual);
       
       }
       
       @DeleteMapping ("/personas/{Id}")
       
       public void eliminar(@PathVariable Integer Id)
       {
         personaService.delete(Id);
       }
}
