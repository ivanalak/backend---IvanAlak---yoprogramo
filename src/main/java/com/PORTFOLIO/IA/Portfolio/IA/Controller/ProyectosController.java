/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PORTFOLIO.IA.Portfolio.IA.Controller;

import com.PORTFOLIO.IA.Portfolio.IA.Model.Proyectos;
import com.PORTFOLIO.IA.Portfolio.IA.Service.ProyectosService;
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
public class ProyectosController {
    
    
     @Autowired
    private ProyectosService proyectosService;
    
    //listar
    
    @GetMapping("/proyectos")
    public List<Proyectos> listar(){
       return proyectosService.findAll();
    }
    
    //guardar
    
    @PostMapping ("/proyectos")
    public Proyectos guardar (@RequestBody Proyectos proyectos)
    {
        return proyectosService.save (proyectos);
    }
            
    //Get una persona
    @GetMapping("/proyectos/{Id}")
    public Proyectos getUnProyecto (@PathVariable Integer Id){
       
        return proyectosService.findById(Id);
    }
    
    //Modificar
    
    @PutMapping ("/proyectos/{Id}")
    
       public Proyectos modificar(@RequestBody Proyectos proyectos, @PathVariable Integer Id)
       {
         Proyectos proyectoActual = proyectosService.findById (Id);
         proyectoActual.setNombre_proyecto(proyectos.getNombre_proyecto());
         
         proyectoActual.setDescripcion(proyectos.getDescripcion ());
         
         proyectoActual.setFoto_url(proyectos.getFoto_url());
         
         return proyectosService.save(proyectoActual);
       
       }
       
       @DeleteMapping ("/proyectos/{Id}")
       
       public void eliminar(@PathVariable Integer Id)
       {
         proyectosService.delete(Id);
       }
    
}
