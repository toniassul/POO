package com.example;

public class Main {
    public static void main(String[] args) {
        

        System.out.println("");
        AguilaAscue aguila1 = new AguilaAscue(5);
        AguilaAscue aguila2 = new AguilaAscue("Femenino", 3);

        System.out.println("Aguila 1 - Edad: " + aguila1.getEdad() + " años" + ", Sexo: " + aguila1.getSexo());   
        System.out.println("Aguila 2 - Edad: " + aguila2.getEdad() + " años" + ", Sexo: " + aguila2.getSexo());
        

    }
}