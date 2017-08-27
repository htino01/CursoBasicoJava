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
public class VentaTv {
    public static void main(String[] args) {
        double precioTv = 299;
        int iva = 13;
        
        double subTotal = precioTv * (iva/100);
        double total = precioTv + subTotal;
        System.out.println("Precio Final con IVA: " + total);
    }
}
