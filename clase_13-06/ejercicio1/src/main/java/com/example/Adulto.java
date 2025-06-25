package com.example;

public class Adulto extends Crisalida {
    String nombreCientifico;
    String especie;
    int edad = 0;

    Adulto(String nombreCientifico, String especie) {
        super(nombreCientifico, especie);
        this.nombreCientifico = nombreCientifico;
        this.especie = especie;
    }

    Adulto(String nombreCientifico, String especie, int edad) {
        super(nombreCientifico, especie);
        this.nombreCientifico = nombreCientifico;
        this.especie = especie;
        this.edad = edad;
    }

    @Override
    public void tiempoDeVida(String edad) {
        System.out.println("La mariposa tiene una edad de " + edad + " días.");
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String getTipo() {
        return especie;
    }


}
