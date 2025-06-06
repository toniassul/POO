package com.example;

public class Main {
    public static void main(String[] args) {
        // operadores aritmeticos
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // operadores relacionales
        System.out.println("\nRelational Operators:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // operadores logicos
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // operadores binarios
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b: " + (a & b)); // Binary AND
        System.out.println("a | b: " + (a | b)); // Binary OR
        System.out.println("a ^ b: " + (a ^ b)); // Binary XOR
        System.out.println("~a: " + (~a)); // Binary Complement

        // operadores de asignacion
        System.out.println("\nAssignment Operators:");
        int c = 10;
        c += 5; // c = c + 5
        System.out.println("c += 5: " + c);
        c -= 3; // c = c - 3
        System.out.println("c -= 3: " + c);
        c *= 2; // c = c * 2
        System.out.println("c *= 2: " + c);
        c /= 4; // c = c / 4
        System.out.println("c /= 4: " + c);

        // operadores de unicion
        System.out.println("\nUnary Operators:");
        int d = 10;
        System.out.println("d++: " + (d++)); // Post-increment
        System.out.println("++d: " + (++d)); // Pre-increment
        System.out.println("d--: " + (d--)); // Post-decrement
        System.out.println("--d: " + (--d)); // Pre-decrement

        // operadores de ternarios o condicionales
        System.out.println("\nTernary Operator:");
        String result = (a > b) ? "a is greater" : "b is greater"; // if - else. 
        
        if (a > b)
            result = "a is greater";
        else
            result = "b is greater";
        
            System.out.println(result);
    }
}