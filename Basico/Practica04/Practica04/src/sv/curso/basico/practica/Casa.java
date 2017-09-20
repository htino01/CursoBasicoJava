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
public class Casa {
    String noCasa;
    String noPasaje;
    String nombreCalle;
    
    public Casa(String noCasa, String noPasaje, String nombreCalle){
        this.noCasa = noCasa;
        this.noPasaje = noPasaje;
        this.nombreCalle = nombreCalle;
    }
    
    public String datosCasa(){
        String informacion = "";
        informacion += "Numero de Casa: " + noCasa + "\n";
        informacion += "Numero de Pasaje: " + noPasaje + "\n";
        informacion += "Nombre de Calle: " + nombreCalle;
        return informacion;
    }
    
    public static void main(String[] args) {
        Casa crearCasa = new Casa("P31", "2A", "Ave Manuel Gallardo");
        JOptionPane.showMessageDialog(null, "Datos de la CASA:\n" +
                                            crearCasa.datosCasa());
    }
}
