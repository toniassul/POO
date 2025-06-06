package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ejemplos de WHILE:");
        
        // Ejemplo 1: WHILE con contador
        System.out.println("\n1. Ejemplo - Contador hasta que el usuario ingrese 0:");
        System.out.println("Ingrese números (0 para terminar):");
        
        int numero = scanner.nextInt();
        int contador = 0;
        
        while (numero != 0) {
            contador++;
            System.out.println("Número ingresado: " + numero);
            System.out.println("Cantidad de números ingresados: " + contador);
            System.out.print("\nIngrese otro número (0 para terminar): ");
            numero = scanner.nextInt();
        }
        
        System.out.println("Total de números ingresados: " + contador);
        System.out.println("¡Programa finalizado!");

        scanner.close();
    }
}
