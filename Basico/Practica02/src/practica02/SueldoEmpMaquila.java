/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02;

/**
 *
 * @author Hector Tino
 */
public class SueldoEmpMaquila {
    
    public static String sueldoEmpleado(double horasEmpleado){
        double salarioHora = 1.20;
        double horaExtra = 1.50;
        double horasMes = 176;
        double extras;
        double horasNormales;
        double horasExtras;
        double sueldo;
        if(horasEmpleado > horasMes){
            extras = horasEmpleado - horasMes;
            horasNormales = horasMes * salarioHora;
            horasExtras = extras * horaExtra;
            sueldo = horasNormales + horasExtras;
            System.out.println("Horas Normales  : " + horasMes +      " Hrs valor total de $" + horasNormales);
            System.out.println("Horas Extras    : " + extras +        " Hrs valor total de $" + horasExtras);
            System.out.println("Total Horas     : " + horasEmpleado + " Hrs total total de $" + sueldo);
            //System.out.println("Total de Sueldo : $" + sueldo);
        }else{
            sueldo = horasEmpleado * salarioHora;
            System.out.println("Total Horas     : " + horasEmpleado + " Hrs total total de $" + sueldo);
        }
        return "";
    }
    
    public static void main(String[] args) {      
        double horasEmpleado = 175;
        sueldoEmpleado(horasEmpleado);
        
    }
}
