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
public class Super_Casa {
    private int numVentanas;
    private int numhabitaciones;
    private boolean tienePiscina;
    private String estilo;

    public Super_Casa() {
    }

    public Super_Casa(int numVentanas, int numhabitaciones, boolean tienePiscina, String estilo) {
        this.numVentanas = 4;
        this.numhabitaciones = 3;
        this.tienePiscina = true;
        this.estilo = "moderno";
    }

    public int getNumVentanas() {
        return numVentanas;
    }

    public int getNumhabitaciones() {
        return numhabitaciones;
    }

    public boolean isTienePiscina() {
        return tienePiscina;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setNumVentanas(int numVentanas) {
        this.numVentanas = numVentanas;
    }

    public void setNumhabitaciones(int numhabitaciones) {
        this.numhabitaciones = numhabitaciones;
    }

    public void setTienePiscina(boolean tienePiscina) {
        this.tienePiscina = tienePiscina;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return "Super_Casa{" + "numVentanas=" + numVentanas + ", numhabitaciones=" + numhabitaciones + ", tienePiscina=" + tienePiscina + ", estilo=" + estilo + '}';
    }
    
    
}

