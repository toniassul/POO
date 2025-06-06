package com.example;

public class DinoAscue {

    String nombre;
    int edad;
    String habitat;

    DinoAscue() {
        System.out.println("Dino Ascue");
    }
    DinoAscue(String nombre) {
        System.out.println("Dino Ascue " + nombre);
    }
    DinoAscue(String nombre, int edad) {
        System.out.println("Dino Ascue " + nombre + " " + edad);
    }
    DinoAscue(String nombre, int edad, String habitat) {
        System.out.println("Dino Ascue " + nombre + " " + edad + " " + habitat);
    }

    public String mostrar_datos() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Habitat: " + habitat;
    }

}
