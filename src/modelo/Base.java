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
public class Base {
    private String descripcion;
    private int cantidadPersonas;
    //constructor
    public Base(String descripcion, int cantidadPersonas) {
        this.descripcion = descripcion;
        this.cantidadPersonas = cantidadPersonas;
    }
     public Base(String descripcion) {
        this.descripcion = descripcion;
    }
     
    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
}
