/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.curso.basico.practica;

import java.text.NumberFormat;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author Hector Tino
 */
public class FrecuenciaCircuito {
    double frecuencia;
    double inductancia;
    double resistencia;
    double capacitancia = 0.1;
    
    public FrecuenciaCircuito(double inductancia, double resistencia) {
        this.inductancia = inductancia;
        this.resistencia = resistencia;
    }
    
    public String frecuenciaCirculo(){
        NumberFormat formato = new DecimalFormat("#,###.##");
        frecuencia = Math.sqrt((1 / (inductancia * capacitancia))-(Math.pow(resistencia, 2)/(4 * Math.pow(capacitancia, 2))));
        String frec = formato.format(frecuencia);
        return frec;
    }
    
    public String freCirculo(){
        String dato = "";
        dato += "La Frecuencia de un Circulo cuyos datos son:\n";
        dato += "Inductancia: " + inductancia + "\n";
        dato += "Resistencia: " + resistencia + "\n";
        dato += "Capacitancia: " + capacitancia + "\n";
        dato += "RESULTADO: " + frecuenciaCirculo();
        return dato;
    }
    
    public static void main(String[] args) {
        String inductancia;
        String resistencia;
        inductancia = JOptionPane.showInputDialog("Ingrese el Valor de la Inductancia (L):");
        resistencia = JOptionPane.showInputDialog("Ingrese el Valor de la Resistencia (R):");
        
        double induc = Double.parseDouble(inductancia);
        double resis = Double.parseDouble(resistencia);
        
        FrecuenciaCircuito freCircuito = new FrecuenciaCircuito(induc, resis);
        
        JOptionPane.showMessageDialog(null, freCircuito.freCirculo());
    }
}
