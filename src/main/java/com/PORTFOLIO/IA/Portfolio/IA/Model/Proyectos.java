/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PORTFOLIO.IA.Portfolio.IA.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table (name="tb_proyectos")
public class Proyectos {
    
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    @Column (name= "Id")
    private Integer Id;
    
    @Column (name= "Nombre_proyecto")
    private String Nombre_proyecto;
    
    @Column (name= "Descripcion")
    private String Descripcion;
    
    @Column (name= "Foto_url")
    private String Foto_url;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getNombre_proyecto() {
        return Nombre_proyecto;
    }

    public void setNombre_proyecto(String Nombre_proyecto) {
        this.Nombre_proyecto = Nombre_proyecto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getFoto_url() {
        return Foto_url;
    }

    public void setFoto_url(String Foto_url) {
        this.Foto_url = Foto_url;
    }
    
    
    
}
