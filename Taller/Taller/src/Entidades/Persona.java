/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author 59396
 */
public class Persona {
    protected String usuario;
    protected String clave;
    protected String nombre;
    protected String apellido; 
    protected String cedula;       
    protected String direccion;
    protected Date fechaNac;
    
    public Persona(){
        
    }
    
    public boolean logIn(){
        return false;
    }
    public boolean logOut(){
        return false;
    }
            
            
}
