package com.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ListaMedicos listaMedicos = new ListaMedicos();

        // Agregar médicos
        listaMedicos.agregarMedico(new Medicos("Dr. Juan Perez", "Cardiología", 101));
        listaMedicos.agregarMedico(new Pediatra("Dr. Ana Gomez", "Pediatría", 102));
        listaMedicos.agregarMedico(new Ortopedista("Dr. Luis Martinez", "Ortopedia", 103));

        // Mostrar médicos
        System.out.println("Lista de Médicos:");
        listaMedicos.mostrarMedicos();

        // Actualizar médico
        listaMedicos.actualizarMedico(101, "Dr. Juan Perez Actualizado", "Cardiología Avanzada");

        // Eliminar médico
        listaMedicos.eliminarMedico(103);

        // Mostrar médicos después de las operaciones
        System.out.println("\nLista de Médicos después de las operaciones:");
        listaMedicos.mostrarMedicos();

        System.out.println("____________________________________________________");
        System.out.println("Hecho por: George Anthony Ascue Sulca");
        System.out.println("____________________________________________________");
        System.in.read(); // Espera a que el usuario presione Enter para cerrar la consola
    }
}