/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.curso.basico.practica03;

import javax.swing.JOptionPane;

/**
 *
 * @author Hector Tino
 */
public class SaleComputer {
    public static void main(String[] args) {
        String valorCompu;
        String porcDesc;
        valorCompu = JOptionPane.showInputDialog("Ingresa el monto del PC sin IVA:");
        porcDesc = JOptionPane.showInputDialog("Valor Descuento:");
        String resultado = SaleComputer.obtenerValorCompu(valorCompu, porcDesc);
        JOptionPane.showMessageDialog(null,"El valor de la PC es: $ " + resultado + " IVA incluido");
    }
    
    public static String obtenerValorCompu(String valorCompu, String porcDesc){
        double valorIva = 13;
        double montoDinero = Double.parseDouble(valorCompu);
        double descuento = Double.parseDouble(porcDesc);
        
        double valorDescuento = montoDinero *(descuento/100);
        valorDescuento = montoDinero - valorDescuento;
        double totalIva = valorDescuento * (valorIva/100);
        String valorTotal = String.valueOf(valorDescuento + totalIva);
        return valorTotal;
    }
}
