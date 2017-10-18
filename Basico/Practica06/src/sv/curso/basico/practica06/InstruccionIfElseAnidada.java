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
public class InstruccionIfElseAnidada {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Digite el salario del empleado:");
        ifElseAnidado(Double.parseDouble(valor));
    }
    
    public static void ifElseAnidado(double salario){
        if(salario>210){
            JOptionPane.showMessageDialog(null, "Empleado gana mas del salario minimo...");
        } else if(salario>0){
            JOptionPane.showMessageDialog(null, "Empleado gana menos del salrio minimo...");
        } else {
            JOptionPane.showMessageDialog(null, "El salario minimo digitado no es valido...");
        }
    }
}
