/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio13;

/**
 *
 * @author ASUS
 */
public class Ejercicio13 {
    public static void main(String[] args) {

        double valor_compra = 543450;
        String color_bolita = "azul";
        double porcentaje_descuento;

        if (color_bolita.equals("blanco")) {
            porcentaje_descuento = 0;
        } else if (color_bolita.equals("verde")) {
            porcentaje_descuento = 10;
        } else if (color_bolita.equals("amarillo")) {
            porcentaje_descuento = 25;
        } else if (color_bolita.equals("azul")) {
            porcentaje_descuento = 50;
        } else { 
            porcentaje_descuento = 100;
        }

        double valor_a_pagar = valor_compra - (porcentaje_descuento * valor_compra / 100);

        System.out.println("El cliente debe pagar: $" + valor_a_pagar);
    }
}