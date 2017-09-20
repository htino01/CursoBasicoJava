/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.curso.basico.practica;

import javax.swing.JOptionPane;
/**
 *
 * @author Hector Tino
 */
public class Bus {
    String matricula;
    int numAsientos;
    int numBus;
    
    public Bus(String matricula, int numAsientos, int numBus){
        this.matricula = matricula;
        this.numAsientos = numAsientos;
        this.numBus = numBus;
    }
    
    public String datosBus(){
        String informacion = "";
        informacion += "Numero de BUS: " + numBus + "\n";
        informacion += "Numero de Matricula: " + matricula + "\n";
        informacion += "Numero de Asientos: " + numAsientos + "\n";
        return informacion;
    }
    
    public static void main(String[] args) {
        String numBus;
        String matricula;
        String numAsientos;
        
        numBus = JOptionPane.showInputDialog("Ingrese el numero de BUS:");
        int cantBus = Integer.parseInt(numBus);
        
        Bus crearBus = new Bus("AB56284", 25, cantBus);
        
        JOptionPane.showMessageDialog(null, "DATOS DEL BUS\n" +
                                            crearBus.datosBus());
    }
}
