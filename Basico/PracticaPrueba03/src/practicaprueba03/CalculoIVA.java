/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaprueba03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Cursos
 */
public class CalculoIVA {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        double precioSinIva;
        double precioConIva;
        
        try{
            System.out.println("Digite Precio Sin IVA:");
            precioSinIva = Double.parseDouble(in.readLine());
            precioConIva = precioSinIva * 1.13;
            
            System.out.println("Precio Sin Iva: " + precioSinIva);
            System.out.println("Precio Con Iva: " + precioConIva);
        } catch (Exception e){
            System.out.println("Error al capturar datos desde el teclado...");
        }
    }
}
