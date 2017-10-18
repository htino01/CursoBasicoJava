/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.curso.intermedio.practica01;

/**
 *
 * @author Cursos
 */
public class Arreglos {
    public static void main(String[] args) {
        String [] nombres = new String[4];
        nombres[0] = "JOSE";
        nombres[1] = "LUIS";
        nombres[2] = "PEREZ";
        nombres[3] = "GOMEZ";
    
        try {
            System.out.println("Nombre: " + nombres[0]);
            System.out.println("Nombre: " + nombres[1]);
            System.out.println("Nombre: " + nombres[2]);
            System.out.println("Nombre: " + nombres[3]);

            System.out.println("Nombre: " + nombres[5]);
        } catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("Arreglo Fuera de Rango");
        } catch (Exception e2){
            System.out.println("Error General");
        }
        
    }
}
