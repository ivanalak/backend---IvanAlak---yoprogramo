/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PORTFOLIO.IA.Portfolio.IA.SecurityController;

import com.PORTFOLIO.IA.Portfolio.IA.SecurityConfigurations.JwtUtil;
import com.PORTFOLIO.IA.Portfolio.IA.SecurityEntity.JwtRequest;
import com.PORTFOLIO.IA.Portfolio.IA.SecurityEntity.JwtResponse;
import com.PORTFOLIO.IA.Portfolio.IA.SecurityEntity.Usuario;

import com.PORTFOLIO.IA.Portfolio.IA.SecurityService.UserDetailsServiceImpl;
import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ivan_
 */

@RestController
@CrossOrigin (origins="*")

public class AuthenticationController {
    
    @Autowired
    private AuthenticationManager authenticationManager;
    
    @Autowired
    private UserDetailsServiceImpl userDetailService;
    
    @Autowired
    private JwtUtil jwtUtils;
    
    @PostMapping("/generate-token")
    public ResponseEntity<?> generarToken(@RequestBody JwtRequest jwtRequest) throws Exception{
    
        try{
        
            autenticar(jwtRequest.getUsername(),jwtRequest.getPassword());
            
        }catch(Exception exception){
    
        
        throw new Exception("Usuario no encontrado");
    }
        
        UserDetails userDetails = this.userDetailService.loadUserByUsername(jwtRequest.getUsername());
        String token = this.jwtUtils.generateToken(userDetails);
        return ResponseEntity.ok(new JwtResponse(token));
    }
    
    private void autenticar(String username, String password) throws Exception {
    
        try{
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username,password));
        }catch(DisabledException disabledException){
        
            throw new Exception("Usuario Deshabilitado" + disabledException.getMessage());
        
        }catch(BadCredentialsException badCredentialsException){
        
            throw new Exception("Credenciales invalidas" + badCredentialsException.getMessage());
        
        
        }
    
    }
    
    @GetMapping("/actual-usuario")
    public Usuario obtenerUsuarioActual(Principal principal){
    
        return (Usuario) this.userDetailService.loadUserByUsername(principal.getName());
    
    }
    
}
    
   
     
     
    
    
