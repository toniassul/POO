package com.example;

//Alumno : George Anthony Ascue Sulca

public class Main {
    public static void main(String[] args) {
        
        // Instancias de objetos reales
        Persona persona = new Persona("Juan",30, "Perez");
        Persona persona2 = new Persona("Maria",25, "Parado");

        Animal animal = new Animal("Perro", 5, "Canino");
        Animal animal2 = new Animal("Gato", 3, "Felino");

        Frutas fruta = new Frutas("Manzana", "Rojo", 1.5);
        Frutas fruta2 = new Frutas("Banana", "Amarillo", 0.5);

        Vehiculos vehiculo = new Vehiculos("Toyota", "Corolla", 2020 , 10000);
        Vehiculos vehiculo2 = new Vehiculos("Honda", "Civic", 2019, 15000);

    
        // Instancias de objetos ficticios
        NumerosPrimos numeroPrimo = new NumerosPrimos(7);
        NumerosPrimos numeroPrimo2 = new NumerosPrimos(10);
        
        FigurasGeometricas figura = new FigurasGeometricas("Cuadrado", 4, 8);
        FigurasGeometricas figura2 = new FigurasGeometricas("Rectangulo", 5, 10);


        // Impresion de objetos reales

        System.out.println("--------------------------------------------------------------");
        
        System.out.println("Objetos reales:");

        
        
        System.out.println("Persona 1: " + persona.getNombre() + persona.getApellido() + ", Edad: " + persona.getEdad());
        System.out.println("Persona 2: " + persona2.getNombre() + persona2.getApellido() + ", Edad: " + persona2.getEdad());
        
        System.out.println("Animal 1: " + animal.getNombre() + ", Edad: " + animal.getEdad() + ", Especie: " + animal.getEspecie());
        System.out.println("Animal 2: " + animal2.getNombre() + ", Edad: " + animal2.getEdad() + ", Especie: " + animal2.getEspecie());
        
        System.out.println("Fruta 1: " + fruta.getNombre() + ", Color: " + fruta.getColor() + ", Precio: " + fruta.getPrecio());
        System.out.println("Fruta 2: " + fruta2.getNombre() + ", Color: " + fruta2.getColor() + ", Precio: " + fruta2.getPrecio());
    
        System.out.println("Vehiculo 1: " + vehiculo.getMarca() + ", Modelo: " + vehiculo.getModelo() + ", Año: " + vehiculo.getAnio() + ", Precio: " + vehiculo.getPrecio());
        System.out.println("Vehiculo 2: " + vehiculo2.getMarca() + ", Modelo: " + vehiculo2.getModelo() + ", Año: " + vehiculo2.getAnio() + ", Precio: " + vehiculo2.getPrecio());
        // Impresion de objetos ficticios
        System.out.println("--------------------------------------------------------------");
        System.out.println("Objetos ficticios:");

        System.out.println("Numero primo 1: " + numeroPrimo.getNumero() + ", Es primo: " + numeroPrimo.esPrimo());
        System.out.println("Numero primo 2: " + numeroPrimo2.getNumero() + ", Es primo: " + numeroPrimo2.esPrimo());

        System.out.println("Figura 1: " + figura.getNombre() + ", Lados: " + figura.getArea() + ", Area: " + figura.getPerimetro());
        System.out.println("Figura 2: " + figura2.getNombre() + ", Lados: " + figura2.getArea() + ", Area: " + figura2.getPerimetro());
    }

}