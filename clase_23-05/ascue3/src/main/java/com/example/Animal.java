package com.example;

public class Animal {
    private String especie;
    private int edad;
    private double peso;

    public Animal(String especie, int edad, double peso) {
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
    }

    public void emitirSonido() {
        System.out.println("El animal de especie " + especie + " está haciendo un sonido");
    }

    public boolean esAdulto() {
        return edad >= 2;  // Consideramos adulto si tiene 2 o más años
    }

    public double calcularComidaDiaria() {
        return peso * 0.05;  // 5% de su peso corporal
    }
}
