package com.example;

public class Main {
    public static void main(String[] args) {
        Gallo gallo = new Gallo();
        Paloma paloma = new Paloma();
        gallo.hacerSonido();
        gallo.volar();

        paloma.hacerSonido();
        paloma.volar();
    }
}