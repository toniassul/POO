package com.example;

public class Oruga extends Larva {
    String nombreCientifico;
    String especie;
    int edad = 0;

    Oruga(String nombreCientifico, String especie) {
        super(nombreCientifico, especie);
        this.nombreCientifico = nombreCientifico;
        this.especie = especie;
    }

    Oruga(String nombreCientifico, String tipo, int edad) {
        super(nombreCientifico, tipo);
        this.nombreCientifico = nombreCientifico;
        this.especie = tipo;
        this.edad = edad;
    }

    @Override
    public void tiempoDeVida(String edad) {
        System.out.println("La oruga tiene una edad de " + edad + " días.");
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String getTipo() {
        return especie;
    }

}
