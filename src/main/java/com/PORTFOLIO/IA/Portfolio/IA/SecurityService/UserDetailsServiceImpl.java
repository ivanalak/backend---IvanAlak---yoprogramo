/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PORTFOLIO.IA.Portfolio.IA.SecurityService;

import com.PORTFOLIO.IA.Portfolio.IA.SecurityEntity.Rol;
import com.PORTFOLIO.IA.Portfolio.IA.SecurityEntity.Usuario;
import com.PORTFOLIO.IA.Portfolio.IA.SecurityEntity.UsuarioRol;
import com.PORTFOLIO.IA.Portfolio.IA.SecurityRepository.UsuarioRepository;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author ivan_
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService{

    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Usuario usuario = this.usuarioRepository.findByUsername(username);
    if(usuario == null){
        throw new UsernameNotFoundException("Usuario no encontrado");
    }
    return usuario;
    }
    
}