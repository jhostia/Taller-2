/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */

public class Punto2 {
    
    public static void main(String[] args) {
        int Numero1 = 8, Numero2 = 3, Numero3 = 6;
        float Suma, Promedio, Producto, Cociente, Modulo;
        Suma = Numero1 + Numero2 + Numero3;
        Promedio = Suma/3;
        Producto = (Numero1 * Numero2 * Numero3);
        Cociente = (Numero1 / Numero2 / Numero3);
        Modulo = (Numero1 % Numero2 % Numero3);
         
         System.out.printf("La suma es: "+Suma+"\n");
         System.out.printf("El promedio es: "+Promedio+"\n");
         System.out.printf("El producto es: "+Producto+"\n");
         System.out.printf("El modulo es: "+Modulo+"\n");
         System.out.printf("El cociente es: "+Cociente+"\n");
         
    }
}

