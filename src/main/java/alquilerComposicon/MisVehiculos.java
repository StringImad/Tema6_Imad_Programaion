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
public class MisVehiculos {
    public static void main(String args[]) {


// se crean dos instancias de la clase Vehiculo


//Vehiculo vehiculo1 = new Vehiculo("4050 ABJ", "VW","GTI", "Blanco",100.0);
Vehiculo vehiculo1 = new Vehiculo(23421, "4050 ABJ", "VW","GTI", "Blanco",100.0, true);

Vehiculo vehiculo2 = new Vehiculo(43253,"2345 JVM", "SEAT", "León", "Negro", 80.0, false);


// se crea una instancia de la clase Cliente


Cliente cliente1 = new Cliente("30435624X", "Juan", "Pérez");


// se crea una instancia de la clase VehiculoAlquilado que
// relaciona al cliente1 con el vehiculo1, el vehículo se
// alquila con fecha 11/11/2011 durante 2 días


VehiculoAlquilado alquiler1 = new VehiculoAlquilado (cliente1, vehiculo1,11,11,2011,2);

VehiculoAlquilado alquiler2 = new VehiculoAlquilado(cliente1,vehiculo1, 2, 1, 2020, 3);

alquiler1.getCliente().getNif(); 

alquiler1.getVehiculo().getMatricula();
System.out.println("Vehículo alquilado"); 
System.out.println("Cliente : " + alquiler1.getCliente().getNif() + " " + alquiler1.getCliente().getNombre() + " " + alquiler1.getCliente().getApellidos());
System.out.println("Vehículo: " + alquiler1.getVehiculo().getMatricula());


}

}
