/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import datos.RepositorioPaquetes;
import interfaz.IPrincipal;
import java.util.ArrayList;
import modelo.Estado;
import modelo.Paquete;
import vista.VPrincipal;

/**
 *
 * @author Admin
 */
public class PresentadorPrincipal {
    private VPrincipal vista;

    public PresentadorPrincipal(IPrincipal vista) {
        this.vista= (VPrincipal) vista;
    }

    public void actualizarPaquetes() {
        ArrayList<Paquete> lista=RepositorioPaquetes.getPaquetes();
        vista.cargarPaquetes(lista);
    }

    public void activarPaquete() {
        int index=vista.getIndexSeleccionada();
        Object valor = vista.getPaqueteSelecionado(index);
        int nroPaquete=(int)valor;
        Paquete paquete = RepositorioPaquetes.buscarById(nroPaquete);
        if(paquete.getEstado()==Estado.Cancelado){
            //Advertir que no se puede cambiar
        }else{
            RepositorioPaquetes.setEstadoById(nroPaquete,Estado.Activo);
        }
        
    }
    
    public void desactivarPaquete() {
        int index=vista.getIndexSeleccionada();
        Object valor = vista.getPaqueteSelecionado(index);
        int nroPaquete=(int)valor;
        Paquete paquete = RepositorioPaquetes.buscarById(nroPaquete);
        if(paquete.getEstado()==Estado.Cancelado){
            //Advertir que no se puede cambiar
        }else{
            RepositorioPaquetes.setEstadoById(nroPaquete,Estado.Inactivo);
        }
        
    }

    public void cancelarPaquete() {
        int index=vista.getIndexSeleccionada();
        Object valor = vista.getPaqueteSelecionado(index);
        int nroPaquete=(int)valor;
        Paquete paquete = RepositorioPaquetes.buscarById(nroPaquete);
        RepositorioPaquetes.setEstadoById(nroPaquete,Estado.Inactivo);
    }

    
}
