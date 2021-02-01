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
public class Persiana extends Ventana {

    private String estadoPersiana;

    public Persiana() {
        super();
        this.estadoPersiana = "La persiana esta bajada";
    }

    public Persiana(String estado, int numVentanas, int numhabitaciones, boolean tienePiscina, String estilo) {
        super(estado, numVentanas, numhabitaciones, tienePiscina, estilo);
    }
    
      public void subirPersiana() {

        this.estadoPersiana = "persiana subida";

    }

    public void bajarPersiana() {

        this.estadoPersiana = "persiana bajada";

    }

    public String getEstadoVentana() {
        return estadoPersiana;
    }

    public void setEstadoVentana(String estado) {
        this.estadoPersiana = estado;
    }

    @Override
    public String toString() {
        return super.toString()+"Persiana{" + "estado=" + estadoPersiana + '}';
    }

}
