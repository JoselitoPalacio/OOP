/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.ejercicio18;

public class Empleado {

    public static double calculo_salario_bruto(double numero_horas_trabajadas, double valor_hora_trabajada) {
        return numero_horas_trabajadas * valor_hora_trabajada;
    }

    public static double calculo_salario_neto(double porcentaje_retencion, double salario_bruto) {
        return salario_bruto * (1 - (porcentaje_retencion / 100));
    }
}
