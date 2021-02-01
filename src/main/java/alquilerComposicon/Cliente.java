/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilerComposicon;

/**
 *
 * @author MSI
 */
public class Cliente {
    	private String nif; 
	private String nombre; 
	private String apellidos;


// se omiten los métodos ‘get’ y ‘set’ de la clase


public Cliente(String nif, String nombre, String apellidos) {
this.nif = nif;
this.nombre = nombre;
this.apellidos = apellidos;
}

    public String getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    
    

}
