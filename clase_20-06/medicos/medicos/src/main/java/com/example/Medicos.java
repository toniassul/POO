package com.example;

public class Medicos {
    String nombre;
    String especialidad;
    int codigo;

    public Medicos(String nombre, String especialidad, int codigo) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Codigo: " + codigo);
    }   
}
