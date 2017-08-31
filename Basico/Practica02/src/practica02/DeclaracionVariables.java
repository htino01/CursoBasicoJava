/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02;

/**
 *
 * @author Hector Tino
 */
public class DeclaracionVariables {
    public static void main(String[] args) {
        //Declaracion de variables sin inicializarlas
        int edadEmpleado;
        double salarioEmpleado;
        String nombreEmpleado;
        char inicialEmpleado;
        boolean empleadoEsActivo;
        
        //Inicializamos las variables
        edadEmpleado = 21;
        salarioEmpleado = 800.00;
        nombreEmpleado = "Jose";
        //El metodo charAt extrae el primer caracter
        //del nombre del empleado
        inicialEmpleado = nombreEmpleado.charAt(0);
        empleadoEsActivo = true;
        
        //Ahora imprimimos las variables
        System.out.println("Edad Empleado   : " + edadEmpleado);
        System.out.println("Salario Empleado: " + salarioEmpleado);
        System.out.println("Nombre Empleado : " + nombreEmpleado);
        System.out.println("Icial Empleado  : " + inicialEmpleado);
        System.out.println("Estado Empleado : " + empleadoEsActivo);
    }
}
