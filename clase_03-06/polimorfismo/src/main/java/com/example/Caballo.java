package com.example;

public class Caballo extends Ascue_Transporte {
    @Override
    public void avanzar() {
        System.out.println("El caballo está galopando");
    }

    @Override
    public void frenar() {
        System.out.println("El caballo está desacelerando");
    }

    @Override
    public void ruido() {
        System.out.println("El caballo hace: ¡Relincho!");
    }
}
