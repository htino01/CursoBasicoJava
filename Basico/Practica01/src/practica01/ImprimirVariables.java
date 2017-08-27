/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica01;

/**
 *
 * @author Cursos
 */
public class ImprimirVariables {
    public static void main(String[] args) {
        //Declaramos e inicializamos las variables al mismo tiempo
        int edad = 0;
        double salario = 1000.00;
        boolean activo = true;
        char sexo = 'M';
        String nombre = "Hector";
        
        System.out.println("Edad    " + edad);
        System.out.println("Salario " + salario);
        System.out.println("Activo  " + activo);
        System.out.println("Sexo    " + sexo);
        System.out.println("Nombre  " + nombre);
    }
}
