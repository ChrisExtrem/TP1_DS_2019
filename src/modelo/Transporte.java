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
public class Transporte extends Servicio implements IObjetoServicio{
    //atributo
    private TipoTransporte tipo;
    private Comodidad comodidad;
    private float seguro;
    
    //constructores

    public Transporte(int desde, int hasta, float precioEspecial, TipoTransporte tipo, Comodidad comodidad,float seguro) {
        super(desde,hasta,precioEspecial);
        this.seguro = seguro;
        this.tipo = tipo;
        this.comodidad = comodidad;
    }



    public float getSeguro() {
        return seguro;
    }

    public void setSeguro(float seguro) {
        this.seguro = seguro;
    }

    public TipoTransporte getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransporte tipo) {
        this.tipo = tipo;
    }

    public Comodidad getComodidad() {
        return comodidad;
    }

    public void setComodidad(Comodidad comodidad) {
        this.comodidad = comodidad;
    }
    
    
    
    
}
