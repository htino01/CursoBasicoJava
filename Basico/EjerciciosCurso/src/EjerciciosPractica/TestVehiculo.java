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
public class TestVehiculo {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("P20284", "G54B2536", "G54B2536", "Negro", "Prestado", 13250.00, true);
        vehiculo1.calcularDepreciacion(vehiculo1);
        vehiculo1.imprimirVehiculo(vehiculo1);
        System.out.println(vehiculo1.toString());
    }
}
