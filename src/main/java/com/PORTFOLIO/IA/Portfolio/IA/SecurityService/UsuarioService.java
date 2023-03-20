/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PORTFOLIO.IA.Portfolio.IA.SecurityService;

import com.PORTFOLIO.IA.Portfolio.IA.SecurityEntity.Usuario;
import com.PORTFOLIO.IA.Portfolio.IA.SecurityEntity.UsuarioRol;
import java.util.Set;
import org.springframework.stereotype.Service;

/**
 *
 * @author ivan_
 */
@Service
public interface UsuarioService {
    
    public Usuario guardarUsuario (Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;
     
    public Usuario obtenerUsuario (String username);
    
    public void eliminarUsuario (Long usuarioId);
    
}
