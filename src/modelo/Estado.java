/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Cesar
 */
public enum Estado {
    Activo,Inactivo,Cancelado;
    private ArrayList<Paquete> paquete; //cuando hay multiplicidad 0...*
}
