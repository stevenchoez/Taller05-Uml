/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cita;

import java.util.Date;

/**
 *
 * @author 59396
 */
public class Cita implements Pago{
    protected Date fecha;
    protected boolean pagada;
    protected String registrarPor;
    
    public Cita(){
        
    }
   

    @Override
    public boolean realizarPago(float pago) {
        return false;        
    }
    
}
