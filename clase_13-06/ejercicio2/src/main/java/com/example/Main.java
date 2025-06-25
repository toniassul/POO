package com.example;

public class Main {
    public static void main(String[] args) {
        Administrador admin = new Administrador("Juan", "Pérez", "Recursos Humanos", "Gerente");

        Cliente cliente = new Cliente("María", "Gómez", "123456789", 1500.00);
        Cliente cliente2 = new Cliente("Femenino", "Ana", "López", 30, "12345678A", "987654321", "987654321", 2000.00);

        for (Persona persona : new Persona[]{admin, cliente, cliente2}) {
            persona.mostrarInformacion();
            persona.puedeConducir();
            System.out.println();
            
        }
    }

}