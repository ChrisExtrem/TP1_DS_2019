/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import datos.RepositorioPaquete;
import interfaz.IPrincipal;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
        ArrayList<Paquete> lista=RepositorioPaquete.getPaquetes();
        vista.cargarPaquetes(lista);
    }

    public void activarPaquete() {
        
        int index=vista.getIndexSeleccionado();
        Object valor = vista.getPaqueteSelecionado(index);
        int nroPaquete=(int)valor;
        Paquete paquete = RepositorioPaquete.buscarById(nroPaquete);
        if(paquete.getEstado().equals(Estado.Cancelado)){
            //Advertir que no se puede cambiar
            JOptionPane.showMessageDialog(null,"No se puede realizar el cambio de estado una vez cancelado");
        }else{
            //Preguntar confirmacion antes de activar
            int resp = JOptionPane.showConfirmDialog(null,"¿Desea activar el paquete?","Mensaje",JOptionPane.YES_NO_OPTION);
            if(resp==JOptionPane.YES_OPTION){
            RepositorioPaquete.setEstadoById(nroPaquete,Estado.Activo);
            }else{
                
            }
        }
        
        actualizarPaquetes();
    }
    
    public void desactivarPaquete() {
        int index=vista.getIndexSeleccionado();
        Object valor = vista.getPaqueteSelecionado(index);
        int nroPaquete=(int)valor;
        Paquete paquete = RepositorioPaquete.buscarById(nroPaquete);
        if(paquete.getEstado()==Estado.Cancelado){
            //Advertir que no se puede cambiar
             JOptionPane.showMessageDialog(null,"No se puede realizar el cambio de estado una vez cancelado");
        }else{
            //Preguntar confirmacion antes de desactivar
            int resp = JOptionPane.showConfirmDialog(null,"¿Desea desactivar el paquete?","Mensaje",JOptionPane.YES_NO_OPTION);
            if(resp==JOptionPane.YES_OPTION){
            RepositorioPaquete.setEstadoById(nroPaquete,Estado.Inactivo);
            }
            else{
            }
        }
        
        actualizarPaquetes();
    }

    public void cancelarPaquete() {
        //Preguntar confirmacion antes de cancelar
        int resp = JOptionPane.showConfirmDialog(null,"¿Desea cancelar el paquete?","Mensaje",JOptionPane.YES_NO_OPTION);
        if(resp==JOptionPane.YES_OPTION){
         int index=vista.getIndexSeleccionado();
        Object valor = vista.getPaqueteSelecionado(index);
        int nroPaquete=(int)valor;
        Paquete paquete = RepositorioPaquete.buscarById(nroPaquete);
        RepositorioPaquete.setEstadoById(nroPaquete,Estado.Cancelado);
        actualizarPaquetes();   
        }
        else{
        }
    }

    
}
