/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import interfaz.IObjetoServicio;

/**
 *
 * @author Cesar
 */
public class Excursion extends Servicio implements IObjetoServicio{
    //atributos
    private String lugar;
    private float seguro;
    
    //constructores
    public Excursion(int desde, int hasta, Float precioEspecial) {
        super(desde, hasta, precioEspecial);
    }

    public Excursion(int desde, int hasta, Float precioEspecial,String lugar, float seguro) {
        super(desde, hasta, precioEspecial);
        this.lugar = lugar;
        this.seguro = seguro;
    }
    
    
    

    //metodos
    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public float getSeguro() {
        return seguro;
    }

    public void setSeguro(float seguro) {
        this.seguro = seguro;
    }
    
}
