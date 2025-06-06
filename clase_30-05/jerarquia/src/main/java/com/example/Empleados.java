package com.example;

public class Empleados {
    private String nombre;
    private String puesto;
    private int salario;

    Empleados(String nombre, String puesto, int salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }
    public void descansar() {
        System.out.println(nombre + " está descansando.");
    }
    public void getSalario() {
        System.out.println(nombre + " ha recibido un salario de " + salario + " unidades monetarias.");
    }


}
