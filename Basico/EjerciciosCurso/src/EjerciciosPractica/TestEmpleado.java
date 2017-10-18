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
public class TestEmpleado {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("02100804831012", "Tino Rivera", "Hector", "Santa Tecla", 1100.00, true);
        emp1.salarioConDescuento(emp1, 10);
        emp1.nombreCliente(emp1);
        System.out.println(emp1.toString());  
    }
}
