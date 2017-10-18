/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.curso.intermedio.practica01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Cursos
 */
public class LeerArchivo {
    public static void main(String[] args) {
        try {
            BufferedReader lector = new BufferedReader(new FileReader("C:/CursoJava.txt"));
            String linea = lector.readLine();
            while (linea != null){
                System.out.println(linea);
                linea = lector.readLine();
            }
        } catch (FileNotFoundException e){
            System.out.println("Error al Abrir Archivo");
        } catch (IOException e){
            System.out.println("Error al Leer Datos");
        }
    }
}
