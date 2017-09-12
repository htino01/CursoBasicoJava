/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.curso.basico.practica03;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author Hector Tino
 */
public class SalarioVentaComputadora {
    public static void main(String[] args) {
        String nomVendedor;
        String compVendidas;
        double impRetencion = 0.10;               
        nomVendedor = JOptionPane.showInputDialog("Nombre del Vendedor");
        compVendidas = JOptionPane.showInputDialog("Computadoras Vendidas");
        
        String result = SalarioVentaComputadora.salarioVenta(compVendidas);
        double resultado = Double.parseDouble(result);
        
        double retencion = resultado * impRetencion;
        double salarioTotal = resultado - retencion;
        
        NumberFormat formato = new DecimalFormat("$#,###.##");
        JOptionPane.showMessageDialog(null, "Vendedor  : " + nomVendedor + "\n" +
                                            "Retencion : " + formato.format(retencion) + "\n" +
                                            "Salario   : " + formato.format(salarioTotal));
    }
    
    public static String salarioVenta(String compuVendidas){
        int cantVendido = Integer.parseInt(compuVendidas);
        double salarioBase = 300.00;
        double comiVenta = 50.00;
        
        double comiTotal = cantVendido * comiVenta;
        salarioBase += comiTotal;
        
        String resultado = String.valueOf(salarioBase);
        return resultado;
    }
}
