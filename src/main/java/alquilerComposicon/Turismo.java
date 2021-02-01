/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilerComposicon;

/**
 *
 * @author MSI
 *
 */
public class Turismo extends Vehiculo {
    // Además de los atributos de Vehiculo, esta clase tiene los siguientes

    private int puertas;
    private boolean marchaAutomatica;

    public Turismo() {
        //llamar a los parametros por defecto de la clase padre(Vehiculo
        super();

        this.puertas = 4;
        this.marchaAutomatica = false;

    }

    public Turismo(long bastidor, String matricula, String marca, String modelo, String color, double tarifa, boolean disponible, int puertas, boolean marchaAutomatica) {

        // Llamada al constructor de la superclase
        // con los atributos propios de Vehiculo
        super(bastidor, matricula, marca, modelo, color, tarifa, disponible);

        // Inicializacíon de los atributos propios del objeto Turismo
        this.puertas = puertas;
        this.marchaAutomatica = marchaAutomatica;
    }

    public int getPuertas() {

        return puertas;
    }

    // Esta clase ahora no implementa métodos aunque hereda los de Vehiculo
    // No implementa constructor, Java creará uno por defecto
//    public String toString() {
//
//        String atributosSuperClase;
//
//        // Llamada al método getAtributos() de la clase Vehiculo
//        atributosSuperClase = super.toString();
//
//// Ahora concateno los atributos de la superclase con los de la subclase
//        return atributosSuperClase + " Puertas: " + this.puertas + " Marcha automática: " + this.marchaAutomatica;
//    }
    public boolean isMarchaAutomatica() {
        return marchaAutomatica;
    }

    public String toString() {
        // Llamada al método toString() de la clase Vehiculo y
// concateno los atributos de la superclase con los de la subclase
        return super.toString() + " Puertas: " + this.puertas + " Marcha automática: " + this.marchaAutomatica;
    }

}
