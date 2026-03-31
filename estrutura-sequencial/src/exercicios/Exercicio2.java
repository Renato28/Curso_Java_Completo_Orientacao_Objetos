package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

    static void main() {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entrada:");
        double pi = 3.14159;
        double raio = entrada.nextDouble();

        double area = pi * Math.pow(raio, 2);
        System.out.println("Saida:");
        System.out.printf("A=%.4f%n", area);

    }
}
