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
public class PruebaHerencia {

    public static void main(String[] args) {
//        String atributos;
  //      Turismo t1 = new Turismo();
//        atributos = t1.toString();
//        System.out.println(atributos);

// Creación de instancias de la superclase Vehiculo y
// de las subclases Turismo, Deportivo y Furgoneta
        Vehiculo miVehiculo = new Vehiculo(343245, "4050 ABJ", "VW", "GTI", "Blanco", 100.0, true);
        Turismo miTurismo = new Turismo(345674, "4060 TUR", "Skoda", "Fabia", "Blanco", 90.0, false, 2, false);
        Deportivo miDeportivo = new Deportivo(Long.valueOf(78654), "4070 DEP", "Ford", "Mustang", "Rojo", 150.0, true, 2000);
        Furgoneta miFurgoneta = new Furgoneta(Long.valueOf(4333), "4080 FUR", "Fiat", "Ducato", "Azul", 80.0, false, 1200, 8);

// invocación del método getAtributos() de cada objeto
// miVehiculo es una instancia de la clase Vehiculo, se
// invoca el método getAtributos() de Vehiculo
        System.out.println("Vehículo : " + miVehiculo.toString());
// miTurismo es una instancia de la clase Turismo, se

// invoca el método getAtributos() de Turismo
//        System.out.print("Turismo " + miTurismo.toString());
//
        // miDeportivo es una instancia de la clase Deportivo,
//// se invoca el método getAtributos() de Deportivo
        System.out.println("Deportivo " + miDeportivo.toString());
//
        // miFurgoneta es una instancia de la clase Furgoneta,
// se invoca el método getAtributos() de Furgoneta
        System.out.println("Furgoneta " + miFurgoneta.toString());
// el objeto miTurismo pertenece a la subclase Turismo,

// es un vehículo y puede invocar a los métodos de la
// superclase Vehiculo: getMatricula(),
// getMarca() y getModelo() porque estos métodos son públicos
        System.out.println("Turismo: " + miTurismo.getMatricula() + " " + miTurismo.getMarca() + " " + miTurismo.getModelo());

    }
}
