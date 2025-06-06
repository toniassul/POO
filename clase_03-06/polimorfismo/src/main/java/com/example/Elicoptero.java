package com.example;

public class Elicoptero extends Ascue_Transporte {
    @Override
    public void avanzar() {
        System.out.println("El helicóptero está volando hacia adelante");
    }

    @Override
    public void frenar() {
        System.out.println("El helicóptero está reduciendo la velocidad");
    }

    @Override
    public void ruido() {
        System.out.println("El helicóptero hace: Wop wop wop!");
    }
}
