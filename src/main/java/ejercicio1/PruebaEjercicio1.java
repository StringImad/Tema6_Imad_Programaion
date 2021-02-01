/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author MSI
 */
public class PruebaEjercicio1 {
    public static void main(String[] args) {
        
        Super_Casa miCasa = new Super_Casa(3, 1, true, "triste");
        miCasa.setEstilo("Alegre");
                
       //PUERTA
        Puerta miPuerta = new Puerta("abierta");
        miPuerta.puertaCerrar();
        miPuerta.toString();
        //CALEFACTOR
        Calefactor miCalefactor = new Calefactor("apagado", 0, 2, 4, true, "minimalista");
        miCalefactor.calefactorEncender();
        miCalefactor.cambiarTemperaturaCalefactor(23);
        miCalefactor.toString();
        //VENTANA
        Ventana miVentana = new Ventana ("abierta", 4, 5, true, "gotica");
        miVentana.ventanaCerrar();
        miVentana.toString();
        //PERSIANA
        Persiana miPersiana = new Persiana("bajada", 2, 4, true, "romano");
        miPersiana.subirPersiana();
        miPersiana.toString();
        
        
        
        
        
        
        
        
        
    }
}
