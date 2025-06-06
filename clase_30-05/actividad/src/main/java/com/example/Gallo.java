package com.example;

public class Gallo extends AscueAves {

    @Override
    public void hacerSonido() {
        System.out.println("El gallo hace quiquiriquí");
    }

    @Override
    public void volar() {
        System.out.println("El gallo está volando cortas distancias");
    }

    public void cantar() {
        System.out.println("El gallo está cantando al amanecer");
    }

}
