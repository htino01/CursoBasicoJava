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
public class PromedioFinalParciales {
    public static void main(String[] args) {        
        String carnet;
        String nombre;
        String nota1;
        String nota2;
        String nota3;
        String nota4;
        
        carnet = JOptionPane.showInputDialog("Ingrese su Carnet:");
        nombre = JOptionPane.showInputDialog("Ingrese su Nombre:");
        nota1 = JOptionPane.showInputDialog("NOTA 1:");
        nota2 = JOptionPane.showInputDialog("NOTA 2:");
        nota3 = JOptionPane.showInputDialog("NOTA 3:");
        nota4 = JOptionPane.showInputDialog("NOTA 4:");
        
        NumberFormat formato = new DecimalFormat("#.##");
        
        String result = PromedioFinalParciales.promedioFinal(nota1, nota2, nota3, nota4);
        double resultado = Double.parseDouble(result);
        JOptionPane.showMessageDialog(null,
                "CARNET: " + carnet + "\n" +
                "NOMBRE: " + nombre + "\n" +
                "NOTA 1: " + nota1 + "\n" +
                "NOTA 2: " + nota2 + "\n" +
                "NOTA 3: " + nota3 + "\n" +
                "NOTA 4: " + nota4 + "\n" +
                "PROMEDIO FINAL: " + formato.format(resultado));
    }
    
    public static String promedioFinal(String nota1, String nota2, String nota3, String nota4){
        double nota01 = Double.parseDouble(nota1);
        double nota02 = Double.parseDouble(nota2);
        double nota03 = Double.parseDouble(nota3);
        double nota04 = Double.parseDouble(nota4);
        
        double promedio = (nota01 + nota02 + nota03 + nota04) / 4;
        String resultado = String.valueOf(promedio);
        return resultado;
    }
}
