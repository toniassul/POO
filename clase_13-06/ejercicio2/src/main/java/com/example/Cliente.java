package com.example;

public class Cliente extends Persona {
    String numeroDeCuenta;
    double saldo;

    public Cliente(String nombre, String apellido, String numeroDeCuenta, double saldo) {
        super(nombre, apellido);
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
    }

    public Cliente(String sexo, String nombre, String apellido, int edad, String dni, String telefono, String numeroDeCuenta, double saldo) {
        super(sexo, nombre, apellido, edad, dni, telefono);
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de Cuenta: " + numeroDeCuenta);
        System.out.println("Saldo: " + saldo);
    }


}
