package com.example;

public class Main {
    public static void main(String[] args) {
        int numeroEntero = 10;
        double NumeroDecimal = numeroEntero;
        System.out.println(numeroEntero);

        double NumeroDecimal2 = 7.5;
        int resultado = (int) NumeroDecimal2;
        System.out.println(resultado);

        String texto = "100";
        int numero = Integer.parseInt(texto);
        System.out.println(numero);
    }
}