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
public class TestCuentaAhorro {
    public static void main(String[] args) {
        CuentaAhorro ca = new CuentaAhorro(26849, 1500.00, 725.50, 0, true);
        ca.imprimirDatos(ca);
        ca.calcularSaldo(ca);
        System.out.println(ca.toString());
    }
}
