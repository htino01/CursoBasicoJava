/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPractica;

/**
 *
 * @author Hector Tino
 */
public class Vehiculo {
    private String placaVehiculo, noMotor, noVin, color, estado;
    private double valorVehiculo, depreciacion;
    private boolean estadoVehiculo;

    @Override
    public String toString() {
        return "Vehiculo{" + "placaVehiculo=" + placaVehiculo + ", noMotor=" + noMotor + ", noVin=" + noVin + ", color=" + color + ", estado=" + estado + ", valorVehiculo=" + valorVehiculo + ", depreciacion=" + depreciacion + ", estadoVehiculo=" + estadoVehiculo + '}';
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public String getNoMotor() {
        return noMotor;
    }

    public void setNoMotor(String noMotor) {
        this.noMotor = noMotor;
    }

    public String getNoVin() {
        return noVin;
    }

    public void setNoVin(String noVin) {
        this.noVin = noVin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }

    public double getDepreciacion() {
        return depreciacion;
    }

    public void setDepreciacion(double depreciacion) {
        this.depreciacion = depreciacion;
    }

    public boolean isEstadoVehiculo() {
        return estadoVehiculo;
    }

    public void setEstadoVehiculo(boolean estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }

    public Vehiculo(String placaVehiculo, String noMotor, String noVin, String color, String estado, double valorVehiculo, boolean estadoVehiculo) {
        this.placaVehiculo = placaVehiculo;
        this.noMotor = noMotor;
        this.noVin = noVin;
        this.color = color;
        this.estado = estado;
        this.valorVehiculo = valorVehiculo;
        //this.depreciacion = depreciacion;
        this.estadoVehiculo = estadoVehiculo;
    }
    
    public void calcularDepreciacion(Vehiculo vh){
        vh.setDepreciacion(vh.getValorVehiculo() / 5);
        System.out.println("La depreciacion es de " + vh.getDepreciacion());
    }
    
    public void imprimirVehiculo(Vehiculo vh){
        System.out.println("Placa   : " + vh.getPlacaVehiculo() + "\n" +
                           "No Motor: " + vh.getNoMotor() + "\n" +
                           "No VIN  : " + vh.getNoVin());
    }
}
