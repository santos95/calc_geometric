package org.example;

import java.util.Scanner;

public class PerimetroCirculo {

    public static void main(String[] args) {
        System.out.println("Bienvenido, Perimetro de un circulo, por favor introducir el radio del circulo:");
        double perimetro;
        double  radio;
        Scanner reader = new Scanner(System.in);
        radio = reader.nextDouble();
        perimetro = 2*Math.PI*radio;
        System.out.println("el perimetro del circulo es :" + perimetro);
    }
}
