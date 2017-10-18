/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oficina;

/**
 *
 * @author Hector Tino
 */
public class TestOficina {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado(1, 20, "Indefinido");
        Empleado emp2 = new Empleado(2, 15, "Temporal");
        Empleado emp3 = new Empleado(1, 20, "Temporal");
        
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        
        Directivo direc1 = new Directivo("Presidente", 1);
        
        System.out.println(direc1.toString());
        
        Persona pers1 = new Persona("Hector", "Tino Rivera", "Salvadoreño", "25641964", 'M', 1100.00);
        direc1.aumentarSueldo(pers1, 2);
    }
}
