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
public class FechaNacimientoNit {
    public static void main(String[] args) {
        String numeroNit;
        numeroNit = JOptionPane.showInputDialog("Ingrese su Numero de NIT:");
        String resultado = FechaNacimientoNit.fechaNacimiento(numeroNit);
        JOptionPane.showMessageDialog(null, "Su fecha de nacimento es: " + resultado);
    }
    
    public static String fechaNacimiento(String nit){
        //0210-080483-101-2
        //0123 456789 112 3
        String separador = " / ";
        String diaNac = nit.substring(4, 6);
        String mesNac = nit.substring(6, 8);
        String anoNac = nit.substring(8, 10);
        
        String patron = diaNac + separador + mesNac + separador + anoNac;      
        return patron;
    }
}
