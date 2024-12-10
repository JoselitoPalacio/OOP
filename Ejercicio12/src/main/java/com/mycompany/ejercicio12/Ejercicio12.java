/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio12;

/**
 *
 * @author ASUS
 */

public class Ejercicio12 {

    public static void main(String[] args) {

        String nombre = "Elias Jose";
        int horas_trabajadas = 53;
        double valor_hora_normal = 4000;
        int horas_extra = 0;
        int horas_extra_excedentes = 0;
        double salario_total;

        if (horas_trabajadas > 40) {
            horas_extra = horas_trabajadas - 40; 
            if (horas_extra > 8) {
                horas_extra_excedentes = horas_extra - 8; 
                salario_total = (40 * valor_hora_normal) 
                        + (8 * 2 * valor_hora_normal) 
                        + (horas_extra_excedentes * 3 * valor_hora_normal); 
            } else {
                salario_total = (40 * valor_hora_normal) 
                        + (horas_extra * 2 * valor_hora_normal); 
            }
        } else {
            salario_total = horas_trabajadas * valor_hora_normal; 
        }

        System.out.println("El trabajador " + nombre + " devengó: $" + salario_total);
    }
}
