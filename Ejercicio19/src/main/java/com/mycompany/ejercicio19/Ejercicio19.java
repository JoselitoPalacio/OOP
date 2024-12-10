/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

    package com.mycompany.ejercicio19;

    /**
     *
     * @author ASUS
     */
    public class Ejercicio19 {

        public static void main(String[] args) {

        double perimetro_triangulo;
        double altura_triangulo;
        double area_triangulo;

        perimetro_triangulo = Triangulo.calculo_perimetro(5);
        altura_triangulo = Triangulo.calculo_altura(5);
        area_triangulo = Triangulo.calculo_area(5, altura_triangulo);



        System.out.println("El perimetro del triángulo es: " + perimetro_triangulo);

        System.out.println("La altura del triángulo es: " + altura_triangulo);
            
        System.out.println("El área del triángulo es: " + area_triangulo);
        
        }
 }      

