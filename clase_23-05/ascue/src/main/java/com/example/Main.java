package com.example;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona("Juan", "Pérez", 25);

        System.out.println("Nombre completo: " + persona.obtenerNombreCompleto());
        System.out.println("Año de nacimiento: " + persona.calcularAnioNacimiento());
        System.out.println("¿Es adulto? " + (persona.esAdulto() ? "Sí" : "No"));
        
    }
}