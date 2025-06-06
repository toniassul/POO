package com.example;

public class Main {
    public static void main(String[] args) {
        DinoAscue d1 = new DinoAscue();
        DinoAscue d2 = new DinoAscue("Tyrannosaurus");
        DinoAscue d3 = new DinoAscue("Velociraptor", 5);
        DinoAscue d4 = new DinoAscue("Triceratops", 10, "Bosque");

        System.out.println(d1.mostrar_datos());
        System.out.println(d2.mostrar_datos());
        System.out.println(d3.mostrar_datos());
        System.out.println(d4.mostrar_datos());
        

    }
}