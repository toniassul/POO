package com.example;

public class Cuadrado extends Ascue_Forma {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
        setFORMA("CUADRADO");
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado con lado: " + lado);
    }

    @Override
    public void borrar() {
        System.out.println("Borrando el cuadrado");
    }

    @Override
    public double CalcArea() {
        return lado * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
