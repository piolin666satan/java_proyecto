package com.example;

import java.util.Scanner;

public class propina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ingresa el valor total de la cuenta (incluyendo IVA): ");
        double valorCuenta = scanner.nextDouble();

        System.out.println(" ingrese el porcenta de la propina que desea dejar (ejemplo: 12): ");
        double porcentajepropina = scanner.nextDouble();

        double valorPropina = valorCuenta *(porcentajepropina/100);
        double valorTotal = valorCuenta + valorPropina;
        
        System.out.println("---resumen de la cuenta---");
        System.out.println(" valor de la cuenta es :" + String.format("%.2f", valorCuenta));
        System.out.println("porcentaje de la propina es: " + String.format("%.0f", porcentajepropina) + "%");
        System.out.println(" valor de la propina :" + String.format("%.2f", valorPropina));
        System.out.println(" valor total de todo: " + String.format("%.2f", valorTotal));
        scanner.close();
    }
}
