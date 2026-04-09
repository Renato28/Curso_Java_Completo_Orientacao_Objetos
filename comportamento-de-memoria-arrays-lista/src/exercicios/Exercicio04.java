package exercicios;

import java.util.Scanner;

public class Exercicio04 {

    static void main() {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantos números vai digitar? ");
        int n = entrada.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = entrada.nextInt();
        }

        int contador = 0;
        System.out.println("\nNUMEROS PARES:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                System.out.printf("%d ", vect[i]);
                contador++;
            }
        }

        System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", contador);


    }
}
