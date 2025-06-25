package com.example;

public class Ortopedista extends Medicos {

    public Ortopedista(String nombre, String especialidad, int codigo) {
        super(nombre, especialidad, codigo);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Ortopedista:");
        super.mostrarInformacion();
    }

}
