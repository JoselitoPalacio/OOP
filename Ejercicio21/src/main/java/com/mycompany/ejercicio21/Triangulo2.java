/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio21;

/**
 *
 * @author ASUS
 */
public class Triangulo2 {
    public static double calculo_perimetro(double hipotenusa_triangulo,double altura_triangulo,double base_triangulo) {
        return hipotenusa_triangulo + altura_triangulo + base_triangulo;
    }
    
    public static double calculo_semiperimetro(double perimetro_triangulo) {
        return perimetro_triangulo / 2;
    }
    
    public static double calculo_area(double altura_triangulo,double base_triangulo) {
        return (base_triangulo * altura_triangulo) / 2;
    }
}
