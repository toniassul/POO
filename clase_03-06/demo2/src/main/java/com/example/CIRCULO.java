package com.example;

public class CIRCULO extends Ascue_Forma {
    private double radio;

    public CIRCULO(double radio) {
        this.radio = radio;
        setFORMA("CIRCULO");
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo con radio: " + radio);
    }

    @Override
    public void borrar() {
        System.out.println("Borrando el círculo");
    }

    @Override
    public double CalcArea() {
        return Math.PI * radio * radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
