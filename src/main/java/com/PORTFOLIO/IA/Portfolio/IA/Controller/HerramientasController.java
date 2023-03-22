/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PORTFOLIO.IA.Portfolio.IA.Controller;

import com.PORTFOLIO.IA.Portfolio.IA.Model.Herramientas;
import com.PORTFOLIO.IA.Portfolio.IA.Service.HerramientasService;
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

public class HerramientasController {
    
    @Autowired
    private HerramientasService herramientasService;
    
    //listar
    
    @GetMapping("/herramientas")
    public List<Herramientas> listar(){
       return herramientasService.findAll();
    }
    
    //guardar
    
    @PostMapping ("/herramientas")
    public Herramientas guardar (@RequestBody Herramientas herramientas)
    {
        return herramientasService.save (herramientas);
    }
            
    //Get una persona
    @GetMapping("/herramientas/{Id}")
    public Herramientas getUnaHerramienta (@PathVariable Integer Id){
       
        return herramientasService.findById(Id);
    }
    
    //Modificar
    
    @PutMapping ("/herramientas/{Id}")
    
       public Herramientas modificar(@RequestBody Herramientas herramientas, @PathVariable Integer Id)
       {
         Herramientas herramientasActual = herramientasService.findById (Id);
         
         herramientasActual.setTipo_de_herramienta(herramientas.getTipo_de_herramienta());
         
         herramientasActual.setDescripcion(herramientas.getDescripcion ());
         
         herramientasActual.setFoto_url(herramientas.getFoto_url());
         
         return herramientasService.save(herramientasActual);
         
         
       
       }
       
       @DeleteMapping ("/herramientas/{Id}")
       
       public void eliminar(@PathVariable Integer Id)
       {
         herramientasService.delete(Id);
       }
    
    
}
