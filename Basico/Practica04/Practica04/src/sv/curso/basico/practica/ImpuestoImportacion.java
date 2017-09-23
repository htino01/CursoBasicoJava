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
public class ImpuestoImportacion {
    double precioArticulo;
    double impuestoArticulo = 1.1; //10% Impuesto
    double precArt1, precArt2, precArt3, precArt4, precArt5;

    public ImpuestoImportacion(double precArt1, double precArt2, double precArt3, double precArt4, double precArt5) {
        this.precArt1 = precArt1;
        this.precArt2 = precArt2;
        this.precArt3 = precArt3;
        this.precArt4 = precArt4;
        this.precArt5 = precArt5;
    }
    
    public String precioTotal(){
        NumberFormat formato = new DecimalFormat("$ #,###.##");
        double precTotalArt = precArt1 + precArt2 + precArt3 + precArt4 + precArt5;
        precioArticulo = precTotalArt * impuestoArticulo;
        String resultado = formato.format(precioArticulo);
        return resultado;
    }
    
    public String imprimir(){
        String dato = "";
        dato += "El precio Total de los articulos con impuesto es:\n";
        dato += "Impuesto: " + ((impuestoArticulo / 0.1)- 1)  + "% \n";
        dato += "PRECIO: " + precioTotal();
        return dato;
    }
    
    public static void main(String[] args) {
        String precArticulo1, precArticulo2, precArticulo3, precArticulo4, precArticulo5;
        
        precArticulo1 = JOptionPane.showInputDialog("Precio Articulo 1:");
        precArticulo2 = JOptionPane.showInputDialog("Precio Articulo 2:");
        precArticulo3 = JOptionPane.showInputDialog("Precio Articulo 3:");
        precArticulo4 = JOptionPane.showInputDialog("Precio Articulo 4:");
        precArticulo5 = JOptionPane.showInputDialog("Precio Articulo 5:");
        
        double prec1 = Double.parseDouble(precArticulo1);
        double prec2 = Double.parseDouble(precArticulo2);
        double prec3 = Double.parseDouble(precArticulo3);
        double prec4 = Double.parseDouble(precArticulo4);
        double prec5 = Double.parseDouble(precArticulo5);
        
        ImpuestoImportacion totalImport = new ImpuestoImportacion(prec1, prec2, prec3, prec4, prec5);
        
        JOptionPane.showMessageDialog(null, totalImport.imprimir());
    }
}
