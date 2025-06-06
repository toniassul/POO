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

public class Ejerciciol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.print("¿Tiene permiso parental? (S/N): ");
        String permiso = sc.nextLine();

        if (edad >= 18 || (edad >= 16 && permiso.equalsIgnoreCase("S"))) {
            System.out.println("Acceso permitido.");
        } else {
            System.out.println("Acceso denegado.");
        }
    }
}
