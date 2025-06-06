package com.example;

public class Motos extends Vehiculos {

    private String tipo;
    private int cilindrada;

    Motos(String marca, String modelo, int anio, String tipo, int cilindrada) {
        super(marca, modelo, anio);
        this.tipo = tipo;
        this.cilindrada = cilindrada;
    }

    public void realizarAcrobacias() {
        System.out.println("La moto " + tipo + " está realizando acrobacias.");
    }

    public void mostrarDetalles() {
        System.out.println("Moto: " + tipo + ", Cilindrada: " + cilindrada + "cc");
    }


}
