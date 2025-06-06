package com.example;

public class Coche extends Ascue_Transporte {
    @Override
    public void avanzar() {
        System.out.println("El coche está acelerando");
    }

    @Override
    public void frenar() {
        System.out.println("El coche está frenando");
    }

    @Override
    public void ruido() {
        System.out.println("El coche hace: ¡Brum brum!");
    }
}
