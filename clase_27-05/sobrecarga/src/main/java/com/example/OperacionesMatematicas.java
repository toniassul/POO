package com.example;

public class OperacionesMatematicas {
    public int sumar(int a, int b) {
        return a + b;
    }
    
    // Sobrecarga del método sumar
    public double sumar(double a, double b) {
        return a + b;
    }
    
    // Sobrecarga del método sumar
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }
    
    public int multiplicar(int a, int b) {
        return a * b;
    }
    
    public double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        }
        return 0;
    }
}
