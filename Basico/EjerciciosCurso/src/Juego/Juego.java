/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

/**
 *
 * @author Hector Tino
 */
public class Juego {
    public static void main(String[] args) {
        Jugador jugadorA = new Jugador("Hector", 0, false);
        Jugador jugadorB = new Jugador("Carlos", 0, false);
        
        jugadorA.setPosicion(6);
        jugadorB.setPosicion(12);
        
        System.out.println(jugadorA.toString());
        System.out.println(jugadorB.toString());
    }
}
