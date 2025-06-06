package com.example;

public class FigurasGeometricas {
    public double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public void imprimirPerimetroCuadrado(double lado) {
        double perimetro = 4 * lado;
        System.out.println("El perímetro del cuadrado es: " + perimetro);
    }
}
