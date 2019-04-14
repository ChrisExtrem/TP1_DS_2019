/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import interfaz.IObjetoServicio;
import java.util.ArrayList;
import modelo.Ciudad;
import modelo.Estado;
import modelo.Paquete;
import modelo.Tarifa;

/**
 *
 * @author Admin
 */
public class RepositorioPaquete {
    
    private static ArrayList<Paquete> paquetes = new ArrayList<Paquete>();
    private static int contadorPaquetes;
    
    //Metodos
    public static ArrayList<Paquete> getPaquetes() {
        return paquetes;
    }
    
    public static void agregarPaquete(String nombre, String descripcion, String itinerario, String condicionesComerciales,int dias, int noches, Ciudad origen, ArrayList<Ciudad> destinos,ArrayList<IObjetoServicio> servicios, ArrayList<Tarifa> tarifas, Estado estado)
    {
        contadorPaquetes++;
        Paquete nuevo = new Paquete(contadorPaquetes,nombre,descripcion,itinerario,condicionesComerciales,dias,noches,origen,destinos,servicios,tarifas,estado);
        paquetes.add(nuevo);
        contadorPaquetes++;
    }
        
    public static Paquete buscarById(int numero){
        Paquete pq = null;
        for(Paquete p : paquetes){
            if(p.getNumero()==numero) pq=p;
        }
        return pq;
    }

    public static void setEstadoById(int nroPaquete, Estado estado) {
        Paquete pq = null;
        for(Paquete p : paquetes){
            if(p.getNumero()==nroPaquete) p.setEstado(estado);
        }
    }


    
    
}
