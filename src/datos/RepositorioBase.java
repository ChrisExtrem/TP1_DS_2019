/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;
import modelo.Base;

/**
 *
 * @author Cesar
 */
public class RepositorioBase {
    private static ArrayList<Base> base = new ArrayList<Base>();

    public static ArrayList<Base> getBase() {
        
        return base;
    }
    
    //Metodos
    public static void agregarBase(String descripcion)
    {
        Base nuevo = new Base(descripcion);
        base.add(nuevo);
    }
    
    
    public static Base buscarByDes(String descripcion){
        Base cons = null;
        for(Base b : base){
            if(b.getDescripcion().equals(descripcion)) cons=b;
        }
        return cons;
       }
}
