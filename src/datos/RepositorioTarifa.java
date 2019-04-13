/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;
import modelo.Tarifa;

/**
 *
 * @author Cesar
 */
public class RepositorioTarifa {
     private static ArrayList<Tarifa> tarifa = new ArrayList<Tarifa>();

    public static ArrayList<Tarifa> getTarifa() {
        
        return tarifa;
    }
    
    //Metodos
    public static void agregarTarifa(float precio)
    {
        Tarifa nuevo = new Tarifa(precio);
        tarifa.add(nuevo);
    }
    
    
    public static Tarifa buscarByprec(float precio){
        Tarifa tf = null;
        for(Tarifa t : tarifa){
            if(t.getPrecio()==precio) tf=t;
        }
        return tf;
       }
     
}
