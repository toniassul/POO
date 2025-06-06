package com.example;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
    }

    public void actualizarEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
        System.out.println("Edad actualizada a: " + edad + " años");
    }

    public void saludar() {
        System.out.println("¡Hola! Mi nombre es " + nombre);
    }
}
