package com.example;

public class CuentaAhorro extends Cuenta{

    boolean activa = true;

    CuentaAhorro(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }

    @Override
    public float retirar(float cantidad) {
        if (activa) {
            super.retirar(cantidad);
        } else {
            System.out.println("Cuenta inactiva, no se puede retirar.");
        }
        return saldo;
    }

    public float consignar(float cantidad) {
        if (activa) {
            return super.consignar(cantidad);
        } else {
            System.out.println("Cuenta inactiva, no se puede consignar.");
            return saldo;
        }
    }

    public void extractoMensual() {
        if (activa) {
            super.extractoMensual();
        } else {
            System.out.println("Cuenta inactiva, no se puede generar extracto mensual.");
        }
    }
    public void imprimir(){
        System.out.println("Cuenta de Ahorro");
        System.out.println("Saldo: " + saldo);
        System.out.println("Número de consignaciones: " + numeroConsignaciones);
        System.out.println("Número de retiros: " + numeroRetiros);
        System.out.println("Tasa anual: " + tasaAnual);
        System.out.println("Comisión mensual: " + ComisionMensual);
        System.out.println("Estado de la cuenta: " + (activa ? "Activa" : "Inactiva"));
    }

}
