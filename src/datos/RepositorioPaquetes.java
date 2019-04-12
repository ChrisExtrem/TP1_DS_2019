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

/**
 *
 * @author Admin
 */
public class RepositorioPaquetes {

    public static ArrayList<Paquete> getPaquetes() {
        ArrayList<Paquete> lista = new ArrayList<Paquete>();
        lista.add(new Paquete(1,"HawaiPack","Descripcion","Intinerario","CondComerciales",2,3,new Ciudad(1,"Roma"),null,null,Estado.Inactivo));
        return lista;
    }
    
    public static Paquete buscarById(int id){
        return null;
    }

    public static void setEstadoById(int nroPaquete, Estado estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
