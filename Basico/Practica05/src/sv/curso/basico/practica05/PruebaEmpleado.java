/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.curso.basico.practica05;

/**
 *
 * @author Hector Tino
 */
public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado emp = new Empleado();
        
        emp.setNoCarnet(2820);
        emp.setNombres("Juan");
        emp.setApellidos("Lopez");
        
        System.out.println("Canet   :" + emp.getNoCarnet());
        System.out.println("Nombre  :" + emp.getNombres());
        System.out.println("Apellido:" + emp.getApellidos());
    }
}
