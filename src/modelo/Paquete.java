/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Cesar
 */
public class Paquete {
 //atributos//
    int numero;
    String nombre;
    String descripcion;
    String itinerario;
    String condicionesComerciales;
    int dias;
    int noches;
    public Ciudad destinos;
    public Servicio servicio;
    private ArrayList<Tarifa> tarifa; //cuando hay multiplicidad 1...*
}
