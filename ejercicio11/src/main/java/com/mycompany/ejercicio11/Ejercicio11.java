/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio11;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int A = sc.nextInt();

        System.out.println("Ingrese otro número");
        int B = sc.nextInt();

        System.out.println("Ingrese otro número");
        int C = sc.nextInt();

        if (A>B && A>C){
            System.out.println(A +" es el número mayor");
        } else if (B>A && B>C){
            System.out.println(B +" es el número mayor");
        } else {
            System.out.println(C +" es el número mayor");
        }
    }

}