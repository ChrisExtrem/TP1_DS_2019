/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;
import modelo.Ciudad;
import modelo.Estado;
import modelo.Paquete;
import modelo.Tarifa;

/**
 *
 * @author Admin
 */
public class RepositorioPaquetes {
    
    private static ArrayList<Paquete> paquetes = new ArrayList<Paquete>();

    public static ArrayList<Paquete> getPaquetes() {
        
        return paquetes;
    }
    
    //Metodos
    public static void agregarPaquete(String nombre, String descripcion, String itinerario, String condicionesComerciales, int dias, int noches, Ciudad origen, ArrayList<Ciudad> destinos, ArrayList<Tarifa> tarifas, Estado estado)
    {
        Paquete nuevo = new Paquete(nombre,descripcion,itinerario,condicionesComerciales,dias,noches,origen,destinos,tarifas,estado);
        paquetes.add(nuevo);
    }
        
    public static Paquete buscarBynro(int numero){
         Paquete pq = null;
        for(Paquete p : paquetes){
            if(p.getNumero()==numero) pq=p;
        }
        return pq;
    }

    public static void setEstadoById(int nroPaquete, Estado estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
