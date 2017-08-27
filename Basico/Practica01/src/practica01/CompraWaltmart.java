/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica01;

/**
 *
 * @author Hector Tino
 */
public class CompraWaltmart {
    public static void main(String[] args) {
        double precioMicroondas = 69;
        double iva = 13;
        
        //Necesitamos saber el precio sin iva ya que lo tenemos con IVA incluido
        double precioSinIva = precioMicroondas / ((iva/100)+1);
               
        System.out.println("El precio sin IVA es : $" + precioSinIva);
    }
}
