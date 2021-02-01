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
public class Puerta extends Super_Casa {

    private String estado;

    public Puerta(String estado) {
        super();
        this.estado = "La ventana esta cerrada";
    }

    public void puertaAbrir() {

        this.estado = "La puerta esta abierta";

    }

    public void puertaCerrar() {

        this.estado = "La puerta esta cerrada";

    }

    public Puerta(String estado, int numVentanas, int numhabitaciones, boolean tienePiscina, String estilo) {
        super(numVentanas, numhabitaciones, tienePiscina, estilo);
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return super.toString()+"Puerta{" + "estado=" + estado + '}';
    }
    
    

}
