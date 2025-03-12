package com.example;

import java.util.Scanner;

public class PrecioTaxiMedellin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ingresa los km viajados en carro (ejemplo 8,2): ");
        double distancia = scanner.nextDouble();

        System.out.println(" ingrese el tiempo que espera pasar en tráficoen en minutos (ejemplo 10): ");
        double tiempoEspera = scanner.nextDouble();

        double tarifaBase = 4000;
        double valorKilometro = 900;
        double valorMinuto = 150;

        double PrecioPorDistancia = distancia*valorKilometro;
        double PrecioPorTiempo = tiempoEspera*valorMinuto;
        double precioTotal = tarifaBase + PrecioPorDistancia + PrecioPorTiempo;
        
        System.out.println("----Resumen del viaje-----");
        System.out.println(" tarifa base: " + tarifaBase);
        System.out.println(" el precio por distancia es de: " +  PrecioPorDistancia);
        System.out.println(" el precio por el tiempo de espera es de :" +  PrecioPorTiempo);
        System.out.println(" en total serian: " + String.format("%2f", precioTotal));
        
        scanner.close();
    }
}
