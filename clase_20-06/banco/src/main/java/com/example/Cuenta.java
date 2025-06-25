package com.example;

public class Cuenta {

    int saldo;
    int numeroConsignaciones;
    int numeroRetiros;
    float tasaAnual;
    float ComisionMensual;

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = (int) saldo;
        this.tasaAnual = tasaAnual;
    }

    public float consignar(float cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            numeroConsignaciones++;
        }
        return saldo;
    }

    public float retirar(float cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            numeroRetiros++;
        }
        return saldo;
    }

    public void calcularIntereses() {
        float intereses = (saldo * tasaAnual) / 12;
        saldo += intereses;
    }

    public void extractoMensual() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Número de consignaciones: " + numeroConsignaciones);
        System.out.println("Número de retiros: " + numeroRetiros);
        System.out.println("Tasa anual: " + tasaAnual);
        System.out.println("Comisión mensual: " + ComisionMensual);
    }
    

}
