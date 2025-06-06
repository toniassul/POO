package com.example;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de las formas
        Ascue_Forma circulo = new CIRCULO(5.0);
        Ascue_Forma cuadrado = new Cuadrado(4.0);

        // Demostrar polimorfismo con círculo
        System.out.println("\n=== " + circulo.getFORMA() + " ===");
        circulo.dibujar();
        System.out.println("Área del círculo: " + circulo.CalcArea());
        circulo.borrar();

        // Demostrar polimorfismo con cuadrado
        System.out.println("\n=== " + cuadrado.getFORMA() + " ===");
        cuadrado.dibujar();
        System.out.println("Área del cuadrado: " + cuadrado.CalcArea());
        cuadrado.borrar();
    }
}