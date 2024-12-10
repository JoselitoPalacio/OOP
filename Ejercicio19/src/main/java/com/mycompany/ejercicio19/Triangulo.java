/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio19;

/**
 *
 * @author ASUS
 */


public class Triangulo {
   
    
     public static double calculo_perimetro(double lado_triangulo) {
        return 3 * lado_triangulo;
    }
    
     public static double calculo_altura(double lado_triangulo) {
        return ((Math.sqrt(3)) / 2 ) * lado_triangulo;
    }
    
    public static double calculo_area(double lado_triangulo, double altura_triangulo) {
        return (lado_triangulo * altura_triangulo)/2;
    }
}
