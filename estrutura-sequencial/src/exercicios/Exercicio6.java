package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

    static void main() {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entrada:");
        double A = entrada.nextDouble();
        double B = entrada.nextDouble();
        double C = entrada.nextDouble();

        double triangulo = A * C / 2.0;
        double circulo = Math.PI * Math.pow(C, 2);
        double trapezio = (A + B) / 2.0 * C;
        double quadrado = B * B;
        double retangulo = A * B;

        System.out.println("Saida");
        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);


    }
}
