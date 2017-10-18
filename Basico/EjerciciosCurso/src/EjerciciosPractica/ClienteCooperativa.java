/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPractica;

/**
 *
 * @author Hector Tino
 */
public class ClienteCooperativa {
    private String noNit, nombreCliente, direccionCliente, telefonoCliente;

    /*public ClienteCooperativa(String noNit, String nombreCliente, String direccionCliente, String telefonoCliente) {
        this.noNit = noNit;
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        this.telefonoCliente = telefonoCliente;
    }*/

    @Override
    public String toString() {
        return "ClienteCooperativa{" + "noNit=" + noNit + ", nombreCliente=" + nombreCliente + ", direccionCliente=" + direccionCliente + ", telefonoCliente=" + telefonoCliente + '}';
    }

    public String getNoNit() {
        return noNit;
    }

    public void setNoNit(String noNit) {
        this.noNit = noNit;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    
}
