/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio14;

/**
 *
 * @author ASUS
 */


public class Ejercicio14 {
    public static void main(String[] args) {

        double ventas_dep1 = 4200000;
        double ventas_dep2 = 250000;
        double ventas_dep3 = 3300000;
        double salario_base = 380320;
        double total_ventas = ventas_dep1 + ventas_dep2 + ventas_dep3;
        double porcentaje_ventas = 0.33 * total_ventas;

        double salario_dep1, salario_dep2, salario_dep3;

        if (ventas_dep1 > porcentaje_ventas) {
            salario_dep1 = salario_base + (0.2 * salario_base);
        } else {
            salario_dep1 = salario_base;
        }

        if (ventas_dep2 > porcentaje_ventas) {
            salario_dep2 = salario_base + (0.2 * salario_base);
        } else {
            salario_dep2 = salario_base;
        }

        if (ventas_dep3 > porcentaje_ventas) {
            salario_dep3 = salario_base + (0.2 * salario_base);
        } else {
            salario_dep3 = salario_base;
        }

        System.out.println("Salario vendedores del departamento 1: $" + salario_dep1);
        System.out.println("Salario vendedores del departamento 2: $" + salario_dep2);
        System.out.println("Salario vendedores del departamento 3: $" + salario_dep3);
    }
}