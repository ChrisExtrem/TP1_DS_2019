/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Cesar
 */
public class Ciudad {
    //atributo//
    private int cod;
    private String nombre;
    
    //contructor//

    public Ciudad(int cod,String nombre) {
        this.nombre = nombre;
        this.cod=cod;
    }
    
      public Ciudad(String nombre) {
        this.nombre = nombre;
    }
    
    //metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
