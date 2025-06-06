package com.example;

public class Main {
    public static void main(String[] args) {
        //Ejemplo 1
        Empleados ingeniero = new Ingenieros("Juan", "Ingeniero de Software", 5000, "Desarrollo Web", 5);
        System.out.println();
        ingeniero.descansar();
        ingeniero.getSalario();
        System.out.println();

        //Ejemplo 2
        Vehiculos moto = new Motos("Yamaha", "MT-09", 2021, "Deportiva", 847);
        moto.arrancar();
        moto.acelerar();
        moto.frenar();
        moto.detener();
        System.out.println();
    }
}