package com.example;

public class TigreAscue {

    String nombre;
    String especie;
    String color;
    String edad;

    TigreAscue(String nombre, String especie, String color, String edad)
    {
        System.out.println("Tigre Ascue: " + nombre + ", " + especie + ", " + color + ", " + edad);
        this.nombre = nombre;
        this.especie = especie;
        this.color = color;
        this.edad = edad;
    }

    public void comer() {
        System.out.println("El tigre " + nombre + " está comiendo.");
    }
    public void dormir() {
        System.out.println("El tigre " + nombre + " está durmiendo.");
    }
    public void correr() {
        System.out.println("El tigre " + nombre + " está correr.");
    }
}
