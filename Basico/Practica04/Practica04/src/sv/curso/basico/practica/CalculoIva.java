/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.curso.basico.practica;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.NumberFormat;
/**
 *
 * @author Hector Tino
 */
public class CalculoIva {
    
    public static String calcularIva(double precioSinIva, double porcIva){
        NumberFormat formato = new DecimalFormat("$#,###.##");
        String resultado = "";
        double precio = precioSinIva * ((porcIva / 100)+1);
        resultado += "El precio con IVA es: " + formato.format(precio);
        return resultado;
    }
    
    public static String precSinIva(double precioConIva, double porcIva){
        NumberFormat formato = new DecimalFormat("$#,###.##");
        String resultado = "";
        double iva = (porcIva / 100) + 1;
        double precio = precioConIva / iva;
        resultado += "El precio sin IVA es: " + formato.format(precio);
        return resultado;
    }
    
    public static void main(String[] args) {
        String precioSinIva;
        String precioConIva;
        String porcIva;
        String resultado;
        
        precioSinIva = JOptionPane.showInputDialog("Ingrese el precio Sin IVA:");
        porcIva = JOptionPane.showInputDialog("Porcentaje de IVA:");
        
        double precSinIva = Double.parseDouble(precioSinIva);
        double porIva = Double.parseDouble(porcIva);

        resultado = CalculoIva.calcularIva(precSinIva, porIva);
                
        JOptionPane.showMessageDialog(null, "RESULTADO:\n" + 
                                            resultado);
        
        precioConIva = JOptionPane.showInputDialog("Ingrese el precio Con IVA:");
        porcIva = JOptionPane.showInputDialog("Porcentaje de IVA:");
        
        double preConIva = Double.parseDouble(precioConIva);
        double porceIva = Double.parseDouble(porcIva);

        resultado = CalculoIva.precSinIva(preConIva, porceIva);
                
        JOptionPane.showMessageDialog(null, "RESULTADO:\n" + 
                                            resultado);
    }
}