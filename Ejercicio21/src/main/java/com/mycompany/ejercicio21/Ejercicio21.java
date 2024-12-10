/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio21;

/**
 *
 * @author ASUS
 */
public class Ejercicio21 {

    public static void main(String[] args) {
        double hipotenusa_triangulo;
        double altura_triangulo;
        double base_triangulo;   
        double perimetro_triangulo;
        double semiperimetro_triangulo;
        double area_triangulo;
        
        perimetro_triangulo = Triangulo2.calculo_perimetro(15, 5, 7);
        semiperimetro_triangulo = Triangulo2.calculo_semiperimetro(perimetro_triangulo);
        area_triangulo = Triangulo2.calculo_area(5, 7);
        
        
        System.out.println("El perímetro del triángulo rectángulo es: "+ perimetro_triangulo);
        System.out.println("El semiperímetro del triángulo rectángulo es: "+ semiperimetro_triangulo);
        System.out.println("El área del triángulo rectángulo es: "+ area_triangulo);
    }
}
