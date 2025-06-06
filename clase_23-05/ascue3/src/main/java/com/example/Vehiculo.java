package com.example;

public class Vehiculo {
    private String marca;
    private String modelo;
    private double velocidad;
    private double combustible;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
        this.combustible = 100;
    }

    public void acelerar(double incremento) {
        velocidad += incremento;
        combustible -= incremento * 0.1;
        System.out.println("Velocidad actual: " + velocidad + " km/h");
    }

    public double obtenerNivelCombustible() {
        return combustible;
    }

    public boolean necesitaRepostar() {
        return combustible < 20;  // Retorna true si el combustible es menor al 20%
    }
}
