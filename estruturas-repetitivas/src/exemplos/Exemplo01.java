package exemplos;

import java.util.Scanner;

public class Exemplo01 {

    static void main() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma quantidade de números a serem digitados: ");
        int N = entrada.nextInt();
        int soma = 0;

        for (int i = 0; i < N; i++) {
            System.out.println("Digite um numero: ");
            int x = entrada.nextInt();
            soma += x;
        }

        System.out.println("SOMA = " + soma);
    }
}
