public class App {
    public static void main(String[] args) {
        // Operadores aritméticos
        int a = 10, b = 5;
        System.out.println("Suma: " + (a + b)); // 15
        System.out.println("Resta: " + (a - b)); // 5
        System.out.println("Multiplicación: " + (a * b)); // 50
        System.out.println("División: " + (a / b)); // 2
        System.out.println("Módulo: " + (a % b)); // 0

        // Operadores relacionales
        System.out.println("a es mayor que b: " + (a > b)); // true
        System.out.println("a es igual a b: " + (a == b)); // false
        System.out.println("a es diferente de b: " + (a != b)); // true

        // Operadores lógicos
        boolean x = true, y = false;
        System.out.println("x AND y: " + (x && y)); // false
        System.out.println("x OR y: " + (x || y)); // true
        System.out.println("NOT x: " + (!x)); // false

        // Operadores de asignación
        int c = 10;
        c += 5; // c = c + 5
        System.out.println("c después de += 5: " + c); // 15

        // Operadores unarios
        int d = 5;
        System.out.println("Incremento: " + (++d)); // 6
        System.out.println("Decremento: " + (--d)); // 5

        // Operador ternario
        int edad = 18;
        String resultado = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println("Resultado: " + resultado); // Mayor de edad
    }
}