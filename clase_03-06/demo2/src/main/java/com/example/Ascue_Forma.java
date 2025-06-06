package com.example;

public abstract class Ascue_Forma {
    private String FORMA;

    public abstract void dibujar();
    public abstract void borrar();
    public abstract double CalcArea();

    public String getFORMA() {
        return FORMA;
    }

    public void setFORMA(String FORMA) {
        this.FORMA = FORMA;
    }
}
