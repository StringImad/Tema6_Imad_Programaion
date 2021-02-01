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
public class Vehiculo {
    private long bastidor;
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    boolean disponible;

    public Vehiculo() {
    }

    public Vehiculo(long bastidor,String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        this.bastidor=bastidor;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }

    public long getBastidor() {
        return bastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "bastidor=" + bastidor + ", matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tarifa=" + tarifa + ", disponible=" + disponible + '}';
    }

}
