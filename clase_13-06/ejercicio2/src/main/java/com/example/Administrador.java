package com.example;

public class Administrador extends Persona {
    String departamento;
    String puesto;

    public Administrador(String nombre, String apellido, String departamento, String puesto) {
        super(nombre, apellido);
        this.departamento = departamento;
        this.puesto = puesto;
    }

    public Administrador(String sexo, String nombre, String apellido, int edad, String dni, String telefono, String departamento, String puesto) {
        super(sexo, nombre, apellido, edad, dni, telefono);
        this.departamento = departamento;
        this.puesto = puesto;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Departamento: " + departamento);
        System.out.println("Puesto: " + puesto);
    }


}
