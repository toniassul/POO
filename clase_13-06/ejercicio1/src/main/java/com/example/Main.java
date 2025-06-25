package com.example;

public class Main {
    public static void main(String[] args) {

        Insecto mariposa = new Adulto("Danaus plexippus", "Mariposa Monarca", 30);
        mariposa.tiempoDeVida("30");
        mariposa.hacerSonido();
        mariposa.alimentarse();
        System.out.println("Nombre científico: " + mariposa.nombreCientifico);
        System.out.println("Especie: " + mariposa.especie);
        System.out.println();

        Insecto crisalida = new Crisalida("Danaus plexippus", "Mariposa Monarca", 10);
        crisalida.tiempoDeVida("10");
        crisalida.hacerSonido();
        crisalida.alimentarse();
        System.out.println("Nombre científico: " + crisalida.nombreCientifico);
        System.out.println("Especie: " + crisalida.especie);
        System.out.println();

        Insecto larva = new Larva("Danaus plexippus", "Mariposa Monarca");
        larva.tiempoDeVida("5");
        larva.hacerSonido();    
        larva.alimentarse();
        System.out.println("Nombre científico: " + larva.nombreCientifico);
        System.out.println("Especie: " + larva.especie);
        System.out.println();
        
        Insecto oruga = new Oruga("Danaus plexippus", "Mariposa Monarca");
        oruga.tiempoDeVida("15");
        oruga.hacerSonido();
        oruga.alimentarse();
        System.out.println("Nombre científico: " + oruga.nombreCientifico);
        System.out.println("Especie: " + oruga.especie);
        System.out.println();
        
        // Polimorfismo: todas las instancias de Insecto pueden ser tratadas como tal
        Insecto[] insectos = {mariposa, crisalida, larva, oruga};
        for (Insecto insecto : insectos) {
            System.out.println("Nombre científico: " + insecto.nombreCientifico);
            System.out.println("Especie: " + insecto.especie);
            insecto.tiempoDeVida("20");
            insecto.hacerSonido();
            insecto.alimentarse();
            System.out.println();
        }
    }
}