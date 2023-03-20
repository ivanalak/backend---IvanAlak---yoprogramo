/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PORTFOLIO.IA.Portfolio.IA.SecurityService;

import com.PORTFOLIO.IA.Portfolio.IA.SecurityEntity.Usuario;
import com.PORTFOLIO.IA.Portfolio.IA.SecurityEntity.UsuarioRol;
import com.PORTFOLIO.IA.Portfolio.IA.SecurityRepository.RolRepository;
import com.PORTFOLIO.IA.Portfolio.IA.SecurityRepository.UsuarioRepository;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ivan_
 */
@Service
public class UsuarioServiceImp implements UsuarioService{
    
     @Autowired
    private UsuarioRepository usuarioRepository; 
    
     
    
    @Autowired
    private RolRepository rolRepository; 

    
    @Override
   public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception{
       
       Usuario usuarioLocal = usuarioRepository.findByUsername(usuario.getUsername());
    
        if (usuarioLocal !=null){
        System.out.println("El usuario ya existe");
        throw new Exception("El usuario ya esta presente");
        
        }
        else{
          for(UsuarioRol usuarioRol: usuarioRoles){
              rolRepository.save(usuarioRol.getRol());
          }
          usuario.getUsuarioRoles().addAll(usuarioRoles);
          usuarioLocal = usuarioRepository.save(usuario);
        }
        return usuarioLocal;
        
    }

    @Override
    public Usuario obtenerUsuario(String username) {
       return usuarioRepository.findByUsername(username);
    }

    @Override
    public void eliminarUsuario(Long usuarioId) {
        usuarioRepository.deleteById(usuarioId);
    }
    
}
