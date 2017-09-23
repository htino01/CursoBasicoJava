/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.curso.basico.practica05;

/**
 *
 * @author Hector Tino
 */
public class Empleado {
    private long noCarnet;
    private String nombres;
    private String apellidos;

    public long getNoCarnet() {
        return noCarnet;
    }

    public void setNoCarnet(long noCarnet) {
        this.noCarnet = noCarnet;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
