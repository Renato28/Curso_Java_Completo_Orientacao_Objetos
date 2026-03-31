package exercicios;

import java.util.Scanner;

public class Exercicio3 {

    static void main() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entrada:");
        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int C = entrada.nextInt();
        int D = entrada.nextInt();

        int diferenca = (A * B -  C * D);
        System.out.println("DIFERENCA = " + diferenca);
    }
}
