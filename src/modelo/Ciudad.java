/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Cesar
 */
public class Ciudad {
    //atributo//
    String nombre;
    public Paquete origen;
    
    //contructor//
     public Ciudad(String nombre, Paquete origen) {
        this.nombre = nombre;
        this.origen = origen;
    }
    
}
