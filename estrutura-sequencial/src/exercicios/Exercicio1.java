package exercicios;

import java.util.Scanner;

public class Exercicio1 {

    static void main() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entrada:");

        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();

        int soma = numero1 + numero2;
        System.out.println("Saida:");
        System.out.println("SOMA = " + soma);


    }
}
