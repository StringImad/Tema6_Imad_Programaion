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
public class Deportivo extends Vehiculo {

    private int cilindrada; // Atributo específico para Deportivo

    public Deportivo(Long bastidor, String matricula, String marca, String modelo, String color, double tarifa,boolean disponible, int cilindrada) {
        super(bastidor, matricula, marca, modelo, color, tarifa, disponible); // Constructor padre
        this.cilindrada = cilindrada;
    }
// métodos ‘get’ de la subclase Deportivo. Se omiten setters 

    public int getCilindrada() {
        return this.cilindrada;
    }


public String toString() {
        // Llamada al método toString() de la clase Vehiculo y
// concateno los atributos de la superclase con los de la subclase
        return super.toString() +  " Cilindrada (cm3): " + this.cilindrada;
    }
}
