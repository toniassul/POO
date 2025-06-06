/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author LAB2-PC09
 */
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        int dia1, dia2, mes1, mes2, annio1, annio2;
        try (Scanner lector = new Scanner(System.in)) {
            System.out.println("Ingrese dia1:");
            dia1 = lector.nextInt();
            System.out.println("Ingrese mes1:");
            mes1 = lector.nextInt();
            System.out.println("Ingrese año1:");
            annio1 = lector.nextInt();
            System.out.println("Ingrese dia2:");
            dia2 = lector.nextInt();
            System.out.println("Ingrese mes2:");
            mes2 = lector.nextInt();
            System.out.println("Ingrese año2:");
            annio2 = lector.nextInt();
            if (annio1 > annio2) {
                System.out.println("Fecha 1 es mayor");
            } else {
                if (annio2 > annio1) {
                    System.out.println("Fecha 2 es mayor");
                } else {
                    if (annio1 == annio2) {
                        if (mes1 > mes2) {
                            System.out.println("Fecha 1 es mayor");
                        } else {
                            if (mes2 > mes1) {
                                System.out.println("Fecha 2 es mayor");
                            } else {
                                if (mes1 == mes2) {
                                    if (dia1 > dia2) {
                                        System.out.println("Fecha 1 es mayor");
                                    } else {
                                        if (dia2 > dia1) {
                                            System.out.println("Fecha 2 es mayor");
                                        } else {
                                            System.out.println("Las dos fechas son iguales");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            // Cerrar el scanner
        }
    }
}
