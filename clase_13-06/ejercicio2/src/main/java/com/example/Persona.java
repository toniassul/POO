package com.example;

public class Persona {
    String sexo;
    String nombre;
    String apellido;
    int edad;
    String dni;
    String telefono;
    Boolean licenciaDeConducir = false;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = "No especificado";
        this.edad = 0;
        this.dni = "No especificado";
        this.telefono = "No especificado";
    }

    public Persona(String sexo, String nombre, String apellido, int edad, String dni, String telefono) {
        this.sexo = sexo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.telefono = telefono;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Sexo: " + sexo);
        System.out.println("Edad: " + edad);
        System.out.println("DNI: " + dni);
        System.out.println("Teléfono: " + telefono);
    }



    public void puedeConducir() {


        if (edad >= 18 && licenciaDeConducir == true) {
            System.out.println("La persona tiene licencia de conducir.");
            System.out.println(nombre + " " + apellido + " puede conducir.");
        } else {
            System.out.println(nombre + " " + apellido + " no puede conducir.");
        }
    }

}
