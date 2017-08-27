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
public class VtaCarExcel {
    public static void main(String[] args) {
        int carrosVendidos = 15;
        double porcenVta = 2;
        double valorCarro = 12000;
        
        double totalVta = carrosVendidos * valorCarro;
        double comision = totalVta * (porcenVta/100);
                
        System.out.println("Comision Ganada : $" + comision);
    }
}
