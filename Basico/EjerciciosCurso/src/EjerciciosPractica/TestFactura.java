/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPractica;

/**
 *
 * @author Hector Tino
 */
public class TestFactura {
    public static void main(String[] args) {
        Factura fac1 = new Factura(1245, "Hector Tino", "25176459", "Nueva San Salvador", 50.00, 13, true);
        fac1.impIva(fac1);
        fac1.imprimir(fac1);
        System.out.println(fac1.toString());
        
    }
}
