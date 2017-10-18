/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.curso.basico.practica06;

import javax.swing.JOptionPane;

/**
 *
 * @author Hector Tino
 */
public class VentaElectrodomesticos {
    public static void main(String[] args) {
        String valorVenta = JOptionPane.showInputDialog("Digite el valor de la venta:");
        String sexoVendedor = JOptionPane.showInputDialog("Digite el sexo del vendedor");
        calcularComision(Double.parseDouble(valorVenta), sexoVendedor.toUpperCase().charAt(0));
    }
    public static void calcularComision(double valorVenta, char sexoVendedor){
        if(sexoVendedor == 'M'){
            double comision = 0.03 * valorVenta;
            double salario = 200 + comision;
            JOptionPane.showMessageDialog(null, "El salario del vendedor Masculino es: " + salario);
        } else if (sexoVendedor == 'F'){
            double comision = 0.05 * valorVenta;
            double salario = 200 + comision;
            JOptionPane.showMessageDialog(null, "El salario del vendedor Femenino es: " + salario);
        } else {
            JOptionPane.showMessageDialog(null, "Sexo del vendedor es invalido...");
        }
    }
}
