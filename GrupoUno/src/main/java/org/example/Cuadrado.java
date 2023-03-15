package org.example;

import java.util.Scanner;

public class Cuadrado {
    private double a;
    private double b;

    public void area() {
        Scanner s = new Scanner(System.in);
        double result;

        System.out.println("Ingrese el lado a: ");
        a = s.nextDouble();
        System.out.println("Ingrese el lado a: ");
        b = s.nextDouble();
        result = a * b;
        System.out.println("El área del cuadrado de lado " + a + " y de lado " + b + " es " + result);

    }
}
