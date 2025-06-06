package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Persona persona = new Persona("Juan", 25);

        persona.imprimirDetalles();
        persona.saludar();
        persona.actualizarEdad(30);
    }
}