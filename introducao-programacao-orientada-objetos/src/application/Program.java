package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    static void main() {

        Locale.setDefault(Locale.US);
        Scanner entrada = new  Scanner(System.in);

        Triangle x, y;
        x = new  Triangle();
        y = new  Triangle();

        System.out.println("Enter the measures of triangule X: ");
        x.a = entrada.nextDouble();
        x.b = entrada.nextDouble();
        x.c = entrada.nextDouble();
        System.out.println("Enter the measures of triangule Y: ");
        y.a = entrada.nextDouble();
        y.b = entrada.nextDouble();
        y.c = entrada.nextDouble();


        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area %.4f%n", areaX);
        System.out.printf("Triangle Y area %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        entrada.close();
    }
}
