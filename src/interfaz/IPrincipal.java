/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.util.ArrayList;
import modelo.Paquete;

/**
 *
 * @author Admin
 */
public interface IPrincipal {
    public void cargarPaquetes(ArrayList<Paquete> lista);
    public int getIndexSeleccionado();
    public Object getPaqueteSelecionado(int index);
}


