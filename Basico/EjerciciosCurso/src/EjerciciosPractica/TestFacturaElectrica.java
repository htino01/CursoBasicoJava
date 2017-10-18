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
public class TestFacturaElectrica {
    public static void main(String[] args) {
        FacturaElectrica face = new FacturaElectrica(3568, 3025, 2010);
        face.consumoMes(face);
        face.consumoDiario(face, 30);
        face.valorFactura(face);
        System.out.println(face.toString());
    }
}
