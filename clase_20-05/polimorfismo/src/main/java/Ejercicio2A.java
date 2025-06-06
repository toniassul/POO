/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB2-PC09
 */
import java.util.Scanner;

public class Ejercicio2A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la temperatura actual (°C): ");
        int temperatura = sc.nextInt();

        if ((temperatura > 15 && temperatura < 25) || (temperatura > 30 && temperatura < 35)) {
            System.out.println("Temperatura ideal para cultivo.");
        } else {
            System.out.println("Temperatura fuera del rango ideal.");
        }
    }
}
