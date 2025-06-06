package com.example;

public class Persona {
    private String nombre;
    private int edad;


    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método estático para validar si una edad es válida
    static boolean esEdadValida(int edad) {
        return edad >= 0 && edad <= 120;
    }

    // Método estático para calcular el promedio de edades
    static double calcularPromedioEdades(int[] edades) {
        if (edades == null || edades.length == 0) {
            return 0.0;
        }
        
        int suma = 0;
        for (int edad : edades) {
            suma += edad;
        }
        return (double) suma / edades.length;
    }

    // Método estático para crear una persona con edad predeterminada
    static Persona crearPersonaDefault(String nombre) {
        return new Persona(nombre, 18);
    }

}
