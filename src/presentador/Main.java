/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;
//Este es un comentario

import datos.RepositorioBase;
import datos.RepositorioCiudad;
import datos.RepositorioPaquete;
import datos.RepositorioTarifa;
import interfaz.IObjetoServicio;
import java.util.ArrayList;
import modelo.Alojamiento;
import modelo.Ciudad;
import modelo.Comida;
import modelo.Comodidad;
import modelo.Estado;
import modelo.Estrella;
import modelo.Excursion;
import modelo.Tarifa;
import modelo.TipoComida;
import modelo.TipoTransporte;
import modelo.Transporte;
import vista.VPrincipal;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Inicializar Repositorios
        RepositorioBase.agregarBase("Simple",1);
        RepositorioBase.agregarBase("Doble",2);
        RepositorioBase.agregarBase("Triple",3);
        RepositorioBase.agregarBase("Cuadruple",4);
        RepositorioBase.agregarBase("Quintuple",5);
        RepositorioBase.agregarBase("Sextuple",6);
        RepositorioCiudad.agregarCiudad("Buenos Aires");
        RepositorioCiudad.agregarCiudad("Cordoba");
        RepositorioCiudad.agregarCiudad("Mendoza");
        RepositorioCiudad.agregarCiudad("Santa Fe");
        RepositorioCiudad.agregarCiudad("Ushuaia");
        ArrayList<Ciudad> listaDeCiudades = RepositorioCiudad.getCiudades();
        Comida comida1 = new Comida(1,3,4.6F,TipoComida.Almuerzo);
        Alojamiento alojamiento1 = new Alojamiento(1,5,4.5F,Estrella.Uno);
        Excursion excursion1 =  new Excursion(2,3,45.00F,"mi casa",2.34F);
        Transporte transporte1 =  new Transporte(3,4,10.56F,TipoTransporte.Avion,Comodidad.Basica,50.00F);
        ArrayList<IObjetoServicio> servicios1 = new ArrayList<IObjetoServicio>();
        servicios1.add(comida1);
        servicios1.add(transporte1);
        servicios1.add(excursion1);
        servicios1.add(alojamiento1);
        ArrayList<Tarifa> tarifas1 = new ArrayList<Tarifa>();
        Tarifa tarifa1 = new Tarifa(RepositorioBase.buscarByCantidadPersonas(2),14.50F);
        tarifas1.add(tarifa1);
        RepositorioPaquete.agregarPaquete("Cordoba","Descripcion","Intinerario","CondComerciales",7,3,new Ciudad(1,"Villa Gral Belgrano"),listaDeCiudades,servicios1,tarifas1,Estado.Inactivo);
        RepositorioPaquete.agregarPaquete("Mendoza","Descripcion","Intinerario","CondComerciales",5,3,new Ciudad(2,"San Rafael"),listaDeCiudades,servicios1,tarifas1,Estado.Inactivo);
        RepositorioPaquete.agregarPaquete("Buenos Aires","Descripcion","Intinerario","CondComerciales",10,3,new Ciudad(3,"Palermo"),listaDeCiudades,servicios1,tarifas1,Estado.Inactivo); 
                
//Cargar repositorios con datos
        //Inicializar Vista Principal
        VPrincipal vprincipal = new VPrincipal();
        vprincipal.setTitle("Pantalla Principal");
        vprincipal.setLocationRelativeTo(null);
        vprincipal.setVisible(true);
        
    }
    
}
