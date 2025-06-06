package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(Persona.esEdadValida(25)); // true
        System.out.println(Persona.esEdadValida(-5)); // false
        System.out.println(Persona.esEdadValida(130)); // false
        System.out.println(Persona.calcularPromedioEdades(new int[]{20, 30, 40})); // 30.0

        

    }
}