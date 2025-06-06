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

public class Programal {
    public static void main(String[] args) {
        int mes, annio;
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el número de un mes: ");
        mes = lector.nextInt();

        System.out.println("Ingrese el año: ");
        annio = lector.nextInt();

        if ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12)) {
            System.out.println("El mes ingresado tiene 31 días");
        } else {
            if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) {
                System.out.println("El mes ingresado tiene 30 días");
            } else {
                if (annio % 4 == 0 && (annio % 100 != 0 || annio % 400 == 0)) {
                    System.out.println("El mes ingresado tiene 29 días y es bisiesto");
                } else {
                    System.out.println("El mes ingresado tiene 28 días");
                }
            }
        }
    }
}