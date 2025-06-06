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

public class EjerciciolA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer

        System.out.print("¿Tiene entrada VIP? (S/N): ");
        String vip = sc.nextLine();

        if (vip.equalsIgnoreCase("S") || (edad > 25 && vip.equalsIgnoreCase("N"))) {
            System.out.println("Acceso a zona VIP permitido.");
        } else {
            System.out.println("Acceso a zona VIP denegado.");
        }
    }
}
