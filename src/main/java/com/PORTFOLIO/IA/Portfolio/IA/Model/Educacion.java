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
@Table (name="tb_educacion")

public class Educacion {
    
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    @Column (name= "Id")
    private Integer Id;
    
    @Column (name= "Tipo_de_educacion")
    private String Tipo_de_educacion;
    
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

    public String getTipo_de_educacion() {
        return Tipo_de_educacion;
    }

    public void setTipo_de_educacion(String Tipo_de_educacion) {
        this.Tipo_de_educacion = Tipo_de_educacion;
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
