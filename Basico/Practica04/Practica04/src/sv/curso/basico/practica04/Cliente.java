/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.curso.basico.practica04;

/**
 *
 * @author Hector Tino
 */
public class Cliente {
    String noDui;
    String nombre;
    long telefono;
    
    public Cliente(String noDui, String nombre, long telefono){
        this.noDui = noDui;
        this.nombre = nombre;
        this.telefono = telefono;
    }
}
