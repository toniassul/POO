package com.example;

public class Aeroplanos {
    private String modelo;
    private int capacidad;
    
    public Aeroplanos(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }
    
    public void volar() {
        System.out.println("El " + modelo + " está volando");
    }
    
    // Sobrecarga del método volar
    public void volar(int altura) {
        System.out.println("El " + modelo + " está volando a " + altura + " metros de altura");
    }
    
    // Sobrecarga del método volar
    public void volar(int altura, int velocidad) {
        System.out.println("El " + modelo + " está volando a " + altura + " metros de altura y " + velocidad + " km/h");
    }
    
    public void despegar() {
        System.out.println("El " + modelo + " está despegando");
    }
    
    public void aterrizar() {
        System.out.println("El " + modelo + " está aterrizando");
    }
}
