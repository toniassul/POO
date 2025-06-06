package com.example;

public class Animales {
    private String nombre;
    private int edad;
    
    public Animales(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void comer() {
        System.out.println(nombre + " está comiendo");
    }
    
    // Sobrecarga del método comer
    public void comer(String alimento) {
        System.out.println(nombre + " está comiendo " + alimento);
    }
    
    // Sobrecarga del método comer
    public void comer(String alimento, int cantidad) {
        System.out.println(nombre + " está comiendo " + cantidad + " porciones de " + alimento);
    }
    
    public void dormir() {
        System.out.println(nombre + " está durmiendo");
    }
    
    public void moverse() {
        System.out.println(nombre + " se está moviendo");
    }
}
