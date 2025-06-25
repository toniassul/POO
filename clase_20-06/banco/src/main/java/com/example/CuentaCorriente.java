package com.example;

public class CuentaCorriente extends Cuenta {
    float sobregiro;

    public CuentaCorriente() {
        super(0, 0);
    }
    public CuentaCorriente(float saldo, float tasaAnual, float sobregiro) {
        super(saldo, tasaAnual);
        this.sobregiro = sobregiro;
    }
    @Override
    public float retirar(float cantidad) {
        if (cantidad > 0 && cantidad <= (saldo + sobregiro)) {
            saldo -= cantidad;
            numeroRetiros++;
        } else {
            System.out.println("Retiro excede el límite de sobregiro.");
        }
        return saldo;
    }

    public float consignar(float cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            numeroConsignaciones++;
        }
        return saldo;
    }

    public void extracto() {
        super.extractoMensual();
        System.out.println("Sobregiro permitido: " + sobregiro);
    }

    public void imprimir() {
        System.out.println("Cuenta Corriente");
        System.out.println("Saldo: " + saldo);
        System.out.println("Número de consignaciones: " + numeroConsignaciones);
        System.out.println("Número de retiros: " + numeroRetiros);
        System.out.println("Tasa anual: " + tasaAnual);
        System.out.println("Comisión mensual: " + ComisionMensual);
        System.out.println("Sobregiro permitido: " + sobregiro);
    }

}
