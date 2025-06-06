package com.example;

public class Persona {
    private String nombre;
    private int edad;
    private double altura;

    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public String obtenerCategoriaPorEdad() {
        if (edad < 12) return "Niño";
        if (edad < 18) return "Adolescente";
        if (edad < 60) return "Adulto";
        return "Adulto mayor";
    }

    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años");
    }

    public boolean estaEnPesoIdeal() {
        // Ejemplo simple: considerando solo la altura
        double pesoIdeal = (altura - 100) * 0.9;
        return pesoIdeal >= 18.5 && pesoIdeal <= 24.9;
    }
}
