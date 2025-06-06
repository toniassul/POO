package com.example;

public class Vehiculos {
    
    private String marca;
    private String modelo;
    private int anio;

    Vehiculos(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    
    public void arrancar() {
        System.out.println("El vehículo está arrancando.");
    }
    public void detener() {
        System.out.println("El vehículo se está deteniendo.");
    }
    public void acelerar() {
        System.out.println("El vehículo está acelerando.");
    }
    public void frenar() {
        System.out.println("El vehículo está frenando.");
    }


}
