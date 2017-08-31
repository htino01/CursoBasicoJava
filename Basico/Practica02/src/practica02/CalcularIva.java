/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author Hector Tino
 */
public class CalcularIva {
    
    public static double obtenerPrecioConIva(double precioSinIva){
        double precioConIva;
        precioConIva = precioSinIva * 1.13;
        return precioConIva;
    }
    
    public static double obtenerPrecioSinIva(double precioConIva){
        double precioSinIva;
        precioSinIva = precioConIva - precioConIva * 0.13;
        return precioSinIva;
    }
    
    public static void main(String[] args) {
        double precioConIva = obtenerPrecioConIva(599.00);
        double precioSinIva = obtenerPrecioSinIva(125.50);
        NumberFormat formato = new DecimalFormat("#0.00");
        System.out.println("Precio con IVA: $" + formato.format(precioConIva));
        System.out.println("Precio sin IVA: $" + formato.format(precioSinIva));
    }
}
