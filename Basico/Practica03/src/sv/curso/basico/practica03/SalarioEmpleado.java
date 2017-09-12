/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.curso.basico.practica03;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author Hector Tino
 */
public class SalarioEmpleado {
    public static void main(String[] args) {
        String nomEmpleado;
        String diasTrabajados;
        String salarioDiario;
        String horasExtras;
        
        nomEmpleado = JOptionPane.showInputDialog("Nombre Empleado:");
        diasTrabajados = JOptionPane.showInputDialog("Cuantos dias trabajo?");
        salarioDiario = JOptionPane.showInputDialog("Cual es su salario diario?");
        horasExtras = JOptionPane.showInputDialog("Cuanta horas extras trabajo?");
        
        String result = SalarioEmpleado.salario(diasTrabajados, salarioDiario, horasExtras);
        Double resultado = Double.parseDouble(result);
        
        NumberFormat formato = new DecimalFormat("$#,###.##");
        
        JOptionPane.showMessageDialog(null, 
                "EMPLEADO: " + nomEmpleado + "\n"+
                "SALARIO : " + formato.format(resultado));
    }
    
    public static String salario(String diasTrabajados, String salarioDiario, String horasExtras){
        int cantDiasTra = Integer.parseInt(diasTrabajados);
        double salarioDia = Double.parseDouble(salarioDiario);
        int cantHorasExt = Integer.parseInt(horasExtras);
        double horaExtra = salarioDia * 0.10;
        
        double salarioNormal = cantDiasTra * salarioDia;
        double salarioHorasExtras = cantHorasExt * horaExtra;
        double salarioTotal = salarioNormal + salarioHorasExtras;
        String resultado = String.valueOf(salarioTotal);
        
        return resultado;
    }
}
