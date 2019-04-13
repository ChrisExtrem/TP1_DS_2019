/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;
//Este es un comentario

import datos.RepositorioPaquetes;
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
        RepositorioPaquetes.agregarPaquete("HawaiPack","Descripcion","Intinerario","CondComerciales",2,3,new Ciudad(1,"Roma"),null,null,Estado.Inactivo);
        //Cargar repositorios con datos
        //Inicializar Vista Principal
        VPrincipal vprincipal = new VPrincipal();
        vprincipal.setTitle("Pantalla Principal");
        vprincipal.setLocationRelativeTo(null);
        vprincipal.setVisible(true);
        
    }
    
}
