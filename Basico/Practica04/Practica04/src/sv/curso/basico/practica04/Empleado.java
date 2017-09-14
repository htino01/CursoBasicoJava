/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.curso.basico.practica04;

/**
 *
 * @author Hector Tino
 */
public class Empleado {
    long noCarnet;
    String nombres;
    String apellidos;
    
    public void registrarEmpleado(){
        System.out.println("Metodo para registrar el empleado...");
    }
    
    public void consultarEmpleado(){
        System.out.println("Metodo para consultar el empleado...");
    }
    
    public void eliminarEmpleado(){
        System.out.println("Metodo para eliminar el empleado...");
    }
    
    public static void main(String[] args) {
        Empleado emp = new Empleado(); //Instancia de la clase empleado
        emp.noCarnet = 2817;
        emp.nombres = "Hector";
        emp.apellidos = "Tino";
        
        emp.registrarEmpleado();
        emp.consultarEmpleado();
        emp.eliminarEmpleado();
        
        System.out.println("No Carnet: " + emp.noCarnet);
        System.out.println("Apellidos: " + emp.apellidos);
        System.out.println("Nombres: " + emp.nombres);
    }
}
