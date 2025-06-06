package com.example;

public class Main {
    public static void main(String[] args) {
        // Probando clase Persona
        System.out.println("\n=== Prueba de Persona ===");
        Persona persona1 = new Persona("Ana López", 25, 1.65);
        Persona persona2 = new Persona("Juan Pérez", 45, 1.75);
        
        persona1.presentarse();
        System.out.println("Categoría: " + persona1.obtenerCategoriaPorEdad());
        System.out.println("¿Está en peso ideal? " + persona1.estaEnPesoIdeal());
        
        persona2.presentarse();
        System.out.println("Categoría: " + persona2.obtenerCategoriaPorEdad());
        System.out.println("¿Está en peso ideal? " + persona2.estaEnPesoIdeal());

        // Probando clase Vehiculo
        System.out.println("\n=== Prueba de Vehículo ===");
        Vehiculo vehiculo1 = new Vehiculo("Toyota", "Corolla");
        Vehiculo vehiculo2 = new Vehiculo("Honda", "Civic");
        
        vehiculo1.acelerar(60);
        System.out.println("Nivel de combustible Toyota: " + vehiculo1.obtenerNivelCombustible() + "%");
        System.out.println("¿Necesita repostar Toyota? " + vehiculo1.necesitaRepostar());
        
        vehiculo2.acelerar(80);
        System.out.println("Nivel de combustible Honda: " + vehiculo2.obtenerNivelCombustible() + "%");
        System.out.println("¿Necesita repostar Honda? " + vehiculo2.necesitaRepostar());

        // Probando clase Animal
        System.out.println("\n=== Prueba de Animal ===");
        Animal animal1 = new Animal("Perro", 3, 15.5);
        Animal animal2 = new Animal("Gato", 5, 4.2);
        
        animal1.emitirSonido();
        System.out.println("¿Es adulto el perro? " + animal1.esAdulto());
        System.out.println("Comida diaria necesaria perro: " + animal1.calcularComidaDiaria() + " kg");
        
        animal2.emitirSonido();
        System.out.println("¿Es adulto el gato? " + animal2.esAdulto());
        System.out.println("Comida diaria necesaria gato: " + animal2.calcularComidaDiaria() + " kg");

        // Probando clase FigurasGeometricas
        System.out.println("\n=== Prueba de Figuras Geométricas ===");
        FigurasGeometricas figuras1 = new FigurasGeometricas();
        FigurasGeometricas figuras2 = new FigurasGeometricas();
        
        System.out.println("Figura 1:");
        System.out.println("Área del círculo (radio 5): " + figuras1.calcularAreaCirculo(5));
        System.out.println("Área del triángulo (base 4, altura 3): " + figuras1.calcularAreaTriangulo(4, 3));
        figuras1.imprimirPerimetroCuadrado(6);
        
        System.out.println("\nFigura 2:");
        System.out.println("Área del círculo (radio 3): " + figuras2.calcularAreaCirculo(3));
        System.out.println("Área del triángulo (base 6, altura 8): " + figuras2.calcularAreaTriangulo(6, 8));
        figuras2.imprimirPerimetroCuadrado(10);

        // Probando clase NumeroPrimos
        System.out.println("\n=== Prueba de Números Primos ===");
        NumeroPrimos primos1 = new NumeroPrimos();
        NumeroPrimos primos2 = new NumeroPrimos();
        
        System.out.println("Prueba 1:");
        System.out.println("¿Es 17 primo? " + primos1.esPrimo(17));
        System.out.print("Números primos hasta 20: ");
        primos1.imprimirPrimosHasta(20);
        
        System.out.println("\nPrueba 2:");
        System.out.println("¿Es 23 primo? " + primos2.esPrimo(23));
        System.out.print("Números primos hasta 30: ");
        primos2.imprimirPrimosHasta(30);
    }
}