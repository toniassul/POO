package com.example;

public class AguilaAscue {

    int edad = 0;
    String sexo = "no especificado";

    AguilaAscue(int edad) {
        this.edad = edad;
    }

    AguilaAscue(String sexo, int edad) {
        this.sexo = sexo;
        this.edad = edad;  
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
