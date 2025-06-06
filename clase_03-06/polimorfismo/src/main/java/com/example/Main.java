package com.example;

public class Main {
    public static void main(String[] args) {
        
        // Crear instancias de cada tipo de transporte
        Ascue_Transporte helicoptero = new Elicoptero();
        Ascue_Transporte caballo = new Caballo();
        Ascue_Transporte coche = new Coche();

        // Demostrar polimorfismo con helicóptero
        System.out.println("");
        System.out.println("=== Helicóptero ===");
        helicoptero.avanzar();
        helicoptero.frenar();
        helicoptero.ruido();

        // Demostrar polimorfismo con caballo
        System.out.println("\n=== Caballo ===");
        caballo.avanzar();
        caballo.frenar();
        caballo.ruido();

        // Demostrar polimorfismo con coche
        System.out.println("\n=== Coche ===");
        coche.avanzar();
        coche.frenar();
        coche.ruido();
    }
}