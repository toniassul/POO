package com.example;

public class Crisalida extends Oruga{
    String nombreCientifico;
    String especie;
    int edad = 0;

    Crisalida(String nombreCientifico, String especie) {
        super(nombreCientifico, especie);
        this.nombreCientifico = nombreCientifico;
        this.especie = especie;
    }

    Crisalida(String nombreCientifico, String especie, int edad) {
        super(nombreCientifico, especie);
        this.nombreCientifico = nombreCientifico;
        this.especie = especie;
        this.edad = edad;
    }

    @Override
    public void tiempoDeVida(String edad) {
        System.out.println("La crisalida tiene una edad de " + edad + " días.");
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String getTipo() {
        return especie;
    }
}
