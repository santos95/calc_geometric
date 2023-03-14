package org.example;

import java.util.Scanner;

public class AreaTrapecio {
    public static void main(String[] args) {

        double baseMayor = 0;
        double baseMenor = 0;
        double altura = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Área de un trapecio:");
        System.out.println("Base mayor:");
        baseMayor = scanner.nextDouble();

        System.out.println("Base menor:");
        baseMenor = scanner.nextDouble();

        System.out.println("Altura:");
        altura = scanner.nextDouble();
        double area = ((baseMenor + baseMayor) * altura) / 2;
        System.out.println("Área de trapecio es: " + area);
    }

}