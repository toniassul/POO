package com.example;

public class Ingenieros extends Empleados {

    private String especialidad;
    private int aniosExperiencia;

    Ingenieros(String nombre, String puesto, int salario, String especialidad, int aniosExperiencia) {
        super(nombre, puesto, salario);
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void diseñar() {
        System.out.println(super.getNombre() + " está diseñando un proyecto de " + especialidad + ".");
    }

    public void supervisar() {
        System.out.println(super.getNombre() + " está supervisando el trabajo de los técnicos.");
    }

    public void mostrarDetalles() {
        System.out.println("Ingeniero: " + super.getNombre() + ", Especialidad: " + especialidad + ", Años de experiencia: " + aniosExperiencia);
    }

}
