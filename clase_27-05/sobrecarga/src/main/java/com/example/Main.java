package com.example;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de la clase OperacionesMatematicas
        OperacionesMatematicas op1 = new OperacionesMatematicas();
        OperacionesMatematicas op2 = new OperacionesMatematicas();
        
        // Probar métodos de OperacionesMatematicas
        System.out.println("=== Operaciones Matemáticas ===");
        System.out.println("Suma de enteros: " + op1.sumar(5, 3));
        System.out.println("Suma de decimales: " + op1.sumar(5.5, 3.3));
        System.out.println("Suma de tres números: " + op2.sumar(1, 2, 3));
        System.out.println("Multiplicación: " + op2.multiplicar(4, 5));
        System.out.println("División: " + op2.dividir(10.0, 2.0));
        System.out.println();
        
        // Crear objetos de la clase Animales
        Animales perro = new Animales("Max", 3);
        Animales gato = new Animales("Luna", 2);
        
        // Probar métodos de Animales
        System.out.println("=== Animales ===");
        perro.comer();
        perro.comer("croquetas");
        perro.comer("carne", 2);
        gato.dormir();
        gato.moverse();
        System.out.println();
        
        // Crear objetos de la clase Aeroplanos
        Aeroplanos avion1 = new Aeroplanos("Boeing 747", 366);
        Aeroplanos avion2 = new Aeroplanos("Airbus A320", 180);
        
        // Probar métodos de Aeroplanos
        System.out.println("=== Aeroplanos ===");
        avion1.despegar();
        avion1.volar();
        avion1.volar(10000);
        avion2.volar(9000, 800);
        avion2.aterrizar();
    }
}