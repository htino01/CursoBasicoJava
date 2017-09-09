/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.curso.basico.practica03;

import java.text.NumberFormat;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author Hector Tino
 */
public class SalarioDevengado {
    public static void main(String[] args) {
        String vendedor;
        String autosVendidos;
        
        vendedor = JOptionPane.showInputDialog("Nombre del Vendedor:");
        autosVendidos = JOptionPane.showInputDialog("Ingrese cuantos Autos vendio:");
        
        NumberFormat formato = new DecimalFormat("$#,###.##");
        
        String result = SalarioDevengado.salario(autosVendidos);
        double resultado = Double.parseDouble(result);
        
        JOptionPane.showMessageDialog(null,
                "VENDEDOR: " + vendedor + "\n" +
                "SALARIO: " + formato.format(resultado));
    }
    
    public static String salario(String autosVendidos){
        double precioAuto = 5000.00;
        double salarioBase = 300.00;
        double comisionPorCarro = 170.00;
        double comisionExtra = 0.05;
        
        int cantVendidos = Integer.parseInt(autosVendidos);
        double totalComision = comisionPorCarro * cantVendidos;
        double totalComisionExtra = (precioAuto * cantVendidos) * comisionExtra;
        
        double salario = salarioBase + totalComision + totalComisionExtra;
        String resultado = String.valueOf(salario);
        
        return resultado;
    }
}
