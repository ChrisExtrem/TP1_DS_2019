/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;
//Este es un comentario

import datos.RepositorioBase;
import datos.RepositorioCiudad;
import datos.RepositorioPaquetes;
import datos.RepositorioTarifa;
import modelo.Ciudad;
import modelo.Estado;
import vista.VPrincipal;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Inicializar Repositorios
        RepositorioPaquetes.agregarPaquete("Cordoba","Descripcion","Intinerario","CondComerciales",7,3,new Ciudad(1,"Villa Gral Belgrano"),null,null,Estado.Inactivo);
        RepositorioPaquetes.agregarPaquete("Mendoza","Descripcion","Intinerario","CondComerciales",5,3,new Ciudad(2,"San Rafael"),null,null,Estado.Inactivo);
        RepositorioPaquetes.agregarPaquete("Buenos Aires","Descripcion","Intinerario","CondComerciales",10,3,new Ciudad(3,"Palermo"),null,null,Estado.Inactivo);
        RepositorioBase.agregarBase("Simple");
        RepositorioBase.agregarBase("Doble");
        RepositorioBase.agregarBase("Triple");
        RepositorioBase.agregarBase("Cuadruple");
        RepositorioBase.agregarBase("Quintuple");
        RepositorioBase.agregarBase("Sextuple");
        RepositorioCiudad.agregarCiudad("Buenos Aires");
        RepositorioCiudad.agregarCiudad("Cordoba");
        RepositorioCiudad.agregarCiudad("Mendoza");
        RepositorioCiudad.agregarCiudad("Santa Fe");
        RepositorioCiudad.agregarCiudad("Ushuaia");
        RepositorioTarifa.agregarTarifa(1000F);
                
//Cargar repositorios con datos
        //Inicializar Vista Principal
        VPrincipal vprincipal = new VPrincipal();
        vprincipal.setTitle("Pantalla Principal");
        vprincipal.setLocationRelativeTo(null);
        vprincipal.setVisible(true);
        
    }
    
}
