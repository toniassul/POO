/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB2-PC09
 */
import java.util.Scanner;

public class Programa3 {
    public static void main(String[] args) {
        int opcion;
        double resultado, num1, num2;
        try (Scanner lector = new Scanner(System.in)) {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("--------------------");
            System.out.println("Escriba una opción del menú");
            
            opcion = lector.nextInt(); //1
            
            System.out.println("Ingrese número1: ");
            num1 = lector.nextDouble(); //15
            System.out.println("Ingrese número2: ");
            num2 = lector.nextDouble(); //3
            
            switch (opcion) {
                case 1: {
                    resultado = num1 + num2; //15+3
                    System.out.println("La suma es: " + resultado);
                    break;
                }
                case 2: {
                    resultado = num1 - num2;
                    System.out.println("La diferencia es: " + resultado);
                    break;
                }
                case 3: {
                    resultado = num1 * num2;
                    System.out.println("El producto es: " + resultado);
                    break;
                }
                case 4: {
                    resultado = num1 / num2;
                    System.out.println("El cociente es: " + resultado);
                    break;
                }
                default: {
                    System.out.println("Opción inválida");
                    break;
                }
            }
        }
    }
}

