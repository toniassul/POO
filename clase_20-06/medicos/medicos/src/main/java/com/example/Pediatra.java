package com.example;

public class Pediatra extends Medicos {

    public Pediatra(String nombre, String especialidad, int codigo) {
        super(nombre, especialidad, codigo);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Pediatra:");
        super.mostrarInformacion();
    }

}
