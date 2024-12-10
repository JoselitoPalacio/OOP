/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número");
        double A = sc.nextDouble();

        System.out.println("Ingrese otro número");
        double B = sc.nextDouble();

        if (A>B){
            System.out.println("A es mayor que B");
        } else if (A==B){
            System.out.println("A es igual que B");
        } else {
            System.out.println(" A es menor que B");
        }
    }

}