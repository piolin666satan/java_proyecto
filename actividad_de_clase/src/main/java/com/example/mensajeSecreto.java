package com.example;

public class mensajeSecreto {
    public static void main(String[] args) {
        String mensajeCodificado = "H0l4  MUnD0,  3st0  3s  Un  m3ns4j3  s3cr3t0";
        String MensajeDeCodificado = mensajeCodificado
        .replace("0", "o")
        .replace("3", "e")
        .replace("4", "a");

        MensajeDeCodificado = MensajeDeCodificado.trim().replaceAll("\\s+", "");
        MensajeDeCodificado = MensajeDeCodificado.toUpperCase();

        System.out.println("Mensaje Decodificado" + MensajeDeCodificado);
    }
}
