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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;


@Entity 
@Table (name= "tb_persona")
public class Persona {
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    @Column (name= "Id")
    private Integer Id;
    
    @Column (name= "Nombre")
    private String Nombre;
    
    @Column (name= "Apellido")
    private String Apellido;
    
    @Column (name= "Mail")
    private String Mail;
    
    @Column (name= "Finalizado")
    private Boolean Finalizado; 
    
    @Column (name="Sobre_mi")
    private String Sobre_mi;
    
    @Column (name="Titulo")
    private String Titulo;
    
    @Column (name="Foto_url")
    private String Foto_url;
    
    
    

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public Boolean getFinalizado() {
        return Finalizado;
    }

    public void setFinalizado(Boolean Finalizado) {
        this.Finalizado = Finalizado;
    }

    public String getSobre_mi() {
        return Sobre_mi;
    }

    public void setSobre_mi(String Sobre_mi) {
        this.Sobre_mi = Sobre_mi;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getFoto_url() {
        return Foto_url;
    }

    public void setFoto_url(String Foto_url) {
        this.Foto_url = Foto_url;
    }

   

    
}
