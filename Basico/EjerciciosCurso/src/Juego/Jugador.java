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
public class Jugador {
    String nombre;
    int posicion;
    boolean penalizado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public boolean isPenalizado() {
        return penalizado;
    }

    public void setPenalizado(boolean penalizado) {
        this.penalizado = penalizado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", posicion=" + posicion + ", penalizado=" + penalizado + '}';
    }

    public Jugador(String nombre, int posicion, boolean penalizado) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.penalizado = penalizado;
    }
}
