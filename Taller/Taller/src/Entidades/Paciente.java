/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Receta.HistoriaClinica;
import Receta.Receta;

/**
 *
 * @author 59396
 */
public class Paciente extends Persona{
    protected String email;
    protected Receta receta;
    protected HistoriaClinica historiaClinica;
    public Paciente(){
        
    }
    public boolean solicitarCita(){
        return false;
       
    }
   
    
}
