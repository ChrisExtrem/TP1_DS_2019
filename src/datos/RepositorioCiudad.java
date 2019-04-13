/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;
import modelo.Ciudad;

/**
 *
 * @author Cesar
 */
public class RepositorioCiudad {
     private static ArrayList<Ciudad> ciudad = new ArrayList<Ciudad>();

    public static ArrayList<Ciudad> getPaquetes() {
        
        return ciudad;
    }
    
    //Metodos
    public static void agregarCiudad(String nombre)
    {
        Ciudad nuevo = new Ciudad(nombre);
        ciudad.add(nuevo);
    }
    
    
    public static Ciudad buscarByNom(String nombre){
        Ciudad cons = null;
        for(Ciudad c : ciudad){
            if(c.getNombre().equals(nombre)) cons=c;
        }
        return cons;
       }
     
}
