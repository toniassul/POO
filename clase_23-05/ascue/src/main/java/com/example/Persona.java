package com.example;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String obtenerNombreCompleto() {
        return nombre + " " + apellido;
    }

    public int calcularAnioNacimiento() {
        int anioActual = 2025;  // Using the current year from context
        return anioActual - edad;
    }

    public boolean esAdulto() {
        return edad >= 18;
    }
}
