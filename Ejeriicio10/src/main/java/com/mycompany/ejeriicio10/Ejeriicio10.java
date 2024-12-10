/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejeriicio10;

/**
 *
 * @author ASUS
 */
public class Ejeriicio10 {
    public static void main(String[] args) {
        
        double valor_matricula;

        int numero_inscripcion = 123456789;
        String nombre_estudiante = "Jorge Borgues";
        double patrimonio = 2500000;
        int estrato_social = 5;
        double valor_matricula_fijo = 50000;


        if(patrimonio>2000000 && estrato_social>3){
            valor_matricula = valor_matricula_fijo + ((patrimonio * 3 )/100);  
            System.out.println("El número de numero_inscripción es:"+ numero_inscripcion); 
            System.out.println("Nombres del estudiante :"+ nombre_estudiante); 
            System.out.println("El valor de la matrícula es :"+ valor_matricula); 
        } else {
            valor_matricula = valor_matricula_fijo;
            System.out.println("El número de numero_inscripción es:"+ numero_inscripcion); 
            System.out.println("Nombres del estudiante :"+ nombre_estudiante); 
            System.out.println("El valor de la matrícula es :"+ valor_matricula);
        }

        
    }

}