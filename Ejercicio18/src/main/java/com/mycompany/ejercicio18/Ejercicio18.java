/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio18;

public class Ejercicio18 {

    public static void main(String[] args) { 

        int cod_empleado;
        String nombre_empleado;
        double porcentaje_retencion;
        double salario_bruto;
        double salario_neto;

        cod_empleado = 246810;
        nombre_empleado = "Pepito Perez";
        
        salario_bruto = Empleado.calculo_salario_bruto(100,10500);
        salario_neto = Empleado.calculo_salario_neto(15, salario_bruto);
        

        System.out.println("El código del empleado es: "+ cod_empleado);
        System.out.println("El nombre del empleado es: "+ nombre_empleado);
        System.out.println("El salario bruto es: "+ salario_bruto);
        System.out.println("El salario neto es: "+ salario_neto);
        
   }
}

