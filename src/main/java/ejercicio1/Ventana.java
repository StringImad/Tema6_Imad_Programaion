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
public class Ventana extends Super_Casa {

    private String estado;

    public Ventana() {
        super();
        this.estado = "La ventana esta cerrada";
    }

    public Ventana(String estado, int numVentanas, int numhabitaciones, boolean tienePiscina, String estilo) {
        super(numVentanas, numhabitaciones, tienePiscina, estilo);
    }

    public void ventanaAbrir() {

        this.estado = "La ventana esta abierta";

    }

    public void ventanaCerrar() {

        this.estado = "La ventana esta cerrada";

    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return super.toString() +"Ventana{" + "estado=" + estado + '}';
    }
    
    

}
