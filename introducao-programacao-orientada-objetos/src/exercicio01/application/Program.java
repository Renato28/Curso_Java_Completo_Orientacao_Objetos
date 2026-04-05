package exercicio01.application;

import exercicio01.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        double area = rectangle.area();
        System.out.printf("Area: %.2f%n", area);

        double perimeter = rectangle.perimeter();
        System.out.printf("Perimeter: %.2f%n", perimeter);

        double diagonal = rectangle.diagonal();
        System.out.printf("Diagonal: %.2f%n", diagonal);
    }
}
