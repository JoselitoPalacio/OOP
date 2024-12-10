/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio22;

/**
 *
 * @author ASUS
 */

import java.util.Scanner;
public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el valor pagado por hora:");
        double valor_por_hora = sc.nextDouble();

        System.out.println("Ingrese el número de horas trabajadas en el mes:");
        int horas_trabajadas = sc.nextInt();
        
        double salario_mensual = valor_por_hora * horas_trabajadas;

        if (salario_mensual > 450000) {
            System.out.println("Nombre: " + nombre);
            System.out.println("Salario mensual: $" + salario_mensual);
        } else {
            System.out.println("Nombre: " + nombre);
        }
    }
}
