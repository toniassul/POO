package com.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println();
        // Crear una cuenta normal
        Cuenta cuenta = new Cuenta(1000, 0.05f);
        cuenta.consignar(200);
        cuenta.retirar(100);
        cuenta.extractoMensual();
        cuenta.calcularIntereses();
        System.out.println();
        System.out.println("________________________________________________________");

        // Crear una cuenta corriente
        CuentaCorriente cuentaCorriente = new CuentaCorriente(1000, 0.05f, 500);
        cuentaCorriente.imprimir();
        cuentaCorriente.consignar(200);
        cuentaCorriente.retirar(100);
        cuentaCorriente.extracto();
        cuentaCorriente.calcularIntereses();
        cuentaCorriente.imprimir();
        System.out.println();
        System.out.println("________________________________________________________");

        // Crear una cuenta de ahorro

        CuentaAhorro cuentaAhorro = new CuentaAhorro(1000, 0.05f);
        cuentaAhorro.imprimir();
        cuentaAhorro.consignar(200);
        cuentaAhorro.retirar(100);
        cuentaAhorro.extractoMensual();
        cuentaAhorro.calcularIntereses();
        cuentaAhorro.imprimir();
        System.out.println();
        System.out.println("________________________________________________________");


        System.out.println("Credito: George Anthony Ascue Sulca");
        
        System.in.read();    
        
        // Credenciales
        //ALUMNO: GEORGE ANTHONY ASCUE SULCA
        


    }
}