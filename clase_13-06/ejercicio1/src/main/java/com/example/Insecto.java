package com.example;

public class Insecto {

    String nombreCientifico;
    String especie;

    Insecto(String nombreCientifico, String especie) {
        this.nombreCientifico = nombreCientifico;
        this.especie = especie;
    }

    public void tiempoDeVida(String edad) {
        System.out.println("El insecto tiene una edad de " + edad + " días.");
    }

    public void hacerSonido() {
        System.out.println("El insecto hace un sonido.");
    }

    public void alimentarse() {
        System.out.println("El insecto se alimenta.");
    }

}
