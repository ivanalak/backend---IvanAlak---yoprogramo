/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PORTFOLIO.IA.Portfolio.IA.SecurityController;

import com.PORTFOLIO.IA.Portfolio.IA.SecurityEntity.Rol;
import com.PORTFOLIO.IA.Portfolio.IA.SecurityEntity.Usuario;
import com.PORTFOLIO.IA.Portfolio.IA.SecurityEntity.UsuarioRol;
import com.PORTFOLIO.IA.Portfolio.IA.SecurityService.UsuarioService;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ivan_
 */
@RestController
@RequestMapping("/user")
@CrossOrigin (origins="*")

public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;
    
   @Autowired
   private BCryptPasswordEncoder bCryptPasswordEncoder;
    
   
    @PostMapping("/")
    public Usuario guardarUsuario (@RequestBody Usuario usuario) throws Exception{
        
        usuario.setPerfil("default.png");
        
        usuario.setPassword(this.bCryptPasswordEncoder.encode(usuario.getPassword()));
        
         Set<UsuarioRol> usuarioRoles = new HashSet<>();
        
        Rol rol = new Rol();
        rol.setRolId(2L);
        rol.setNombre("NORMAL");
        
        UsuarioRol usuarioRol = new UsuarioRol();
        usuarioRol.setUsuario(usuario);
        usuarioRol.setRol(rol);
    
        usuarioRoles.add(usuarioRol);
        return usuarioService.guardarUsuario(usuario, usuarioRoles);
    
    }
    
    @GetMapping ("/{username}")
    public Usuario obtenerUsuario(@PathVariable ("username") String username){
    
        return usuarioService.obtenerUsuario(username);
    
    }
    
    @DeleteMapping ("/{usuarioId}")
    public void eliminarUsuario(@PathVariable("usuarioId") Long usuarioId){
    
        usuarioService.eliminarUsuario(usuarioId);
    
    }
    
    
}
