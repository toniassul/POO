package com.example;

public class Larva extends Insecto {
    String nombreCientifico;
    String especie;

    Larva(String nombreCientifico, String especie) {
        super(nombreCientifico, especie);
        this.nombreCientifico = nombreCientifico;
        this.especie = especie;
    }

    @Override
    public void tiempoDeVida(String edad) {
        System.out.println("La larva tiene una edad de " + edad + " días.");
    }

    @Override
    public void hacerSonido() {
        System.out.println("La larva hace un sonido.");
    }

    @Override
    public void alimentarse() {
        System.out.println("La larva se alimenta de hojas.");
    }
    

}
