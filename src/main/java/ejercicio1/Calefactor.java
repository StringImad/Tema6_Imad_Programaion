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
public class Calefactor extends Super_Casa{
    
    private String estado;
    private int temperatura;
    public Calefactor() {
        super();
        this.estado = "Calefactor apagado";
        this.temperatura = 21;
    }

    public Calefactor(String estado, int temperatura, int numVentanas, int numhabitaciones, boolean tienePiscina, String estilo) {
        super(numVentanas, numhabitaciones, tienePiscina, estilo);
    }

    public void calefactorEncender() {

        this.estado = "Calefactor encendido";

    }

    public void calefactorApagar() {

        this.estado = "Calefactor apagado";

    }
    
    public void cambiarTemperaturaCalefactor(int grados){
        
        
        this.temperatura = grados;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return super.toString()+"Calefactor{" + "estado=" + estado + ", temperatura=" + temperatura + '}';
    }
    
    
}
    
