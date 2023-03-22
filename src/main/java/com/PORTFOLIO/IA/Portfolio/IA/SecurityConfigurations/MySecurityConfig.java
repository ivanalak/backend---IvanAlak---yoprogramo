/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PORTFOLIO.IA.Portfolio.IA.SecurityConfigurations;





import com.PORTFOLIO.IA.Portfolio.IA.SecurityService.UserDetailsServiceImpl;


import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;

import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.security.config.http.SessionCreationPolicy;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;



/**
 *
 * @author ivan_
 */
@Configuration

@RequiredArgsConstructor

public class MySecurityConfig {
    @Autowired
    private  JwtAuthenticationEntryPoint unauthorizeHandler;

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Autowired
    private JwtAuthenticationFilter jwtAuthenticationFilter;


    @Bean
   public BCryptPasswordEncoder passwordEncoder(){

        return new BCryptPasswordEncoder();
    }


  @Bean
   protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

      http.csrf().disable()
              .authorizeHttpRequests().requestMatchers("/generate-token", 
                      "/user/", "/actual-usuario"
                      ,"/api/personas","/api/personas/{Id}"
                      ,"/api/educacions","/api/educacions/{Id}"
                      ,"/api/experiencias","/api/experiencias/{Id}"
                      ,"/api/herramientas","/api/herramientas/{Id}"
                      ,"/api/proyectos","/api/proyectos/{Id}")
              .permitAll().
              anyRequest().authenticated().and().
              exceptionHandling().authenticationEntryPoint(unauthorizeHandler).and().sessionManagement()
              .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
                
          http.addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
         	
           
          return http.build();
		}


     @Bean
  public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
    return authConfig.getAuthenticationManager();
  }


        
     @Bean
  public DaoAuthenticationProvider authenticationProvider() {
      DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
       
      authProvider.setUserDetailsService(userDetailsService);
      authProvider.setPasswordEncoder(passwordEncoder());
   
      return authProvider;
  }   

  
 
}




    
        
    
   
   
   
   
 
   
  

    
   

