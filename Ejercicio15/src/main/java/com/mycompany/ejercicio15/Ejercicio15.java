/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio15;

/**
 *
 * @author ASUS
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        
        double peso_a = 30;
        double peso_b = 54;
        double peso_c = 54;
        double peso_d = 5;

        if (peso_a == peso_b && peso_a == peso_c) {
            if (peso_d > peso_a) {
                System.out.println("La esfera D es la diferente y es de mayor peso.");
            } else {
                System.out.println("La esfera D es la diferente y es de menor peso.");
            }
        } else if (peso_a == peso_b && peso_a == peso_d) {
            // C es la diferente
            if (peso_c > peso_a) {
                System.out.println("La esfera C es la diferente y es de mayor peso.");
            } else {
                System.out.println("La esfera C es la diferente y es de menor peso.");
            }
        } else if (peso_a == peso_c && peso_a == peso_d) {
            if (peso_b > peso_a) {
                System.out.println("La esfera B es la diferente y es de mayor peso.");
            } else {
                System.out.println("La esfera B es la diferente y es de menor peso.");
            }
        } else {
            if (peso_a > peso_b) {
                System.out.println("La esfera A es la diferente y es de mayor peso.");
            } else {
                System.out.println("La esfera A es la diferente y es de menor peso.");
            }
        }
    }
}