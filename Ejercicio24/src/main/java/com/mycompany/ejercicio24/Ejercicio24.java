/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio24;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el peso de la esfera A:");
        double peso_a = sc.nextDouble();

        System.out.println("Ingrese el peso de la esfera B:");
        double peso_b = sc.nextDouble();

        System.out.println("Ingrese el peso de la esfera C:");
        double peso_c = sc.nextDouble();

        if (peso_a > peso_b && peso_a > peso_c) {
            System.out.println("La esfera A es la de mayor peso con: " + peso_a);
        } else if (peso_b > peso_a && peso_b > peso_c) {
            System.out.println("La esfera B es la de mayor peso con: " + peso_b);
        } else {
            System.out.println("La esfera C es la de mayor peso con: " + peso_c);
        }
    }
}
