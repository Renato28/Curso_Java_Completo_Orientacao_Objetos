package exercicios;

import java.util.Scanner;

public class Exercicio09 {

    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantas pessoas você vai digitar? ");
        int n =  entrada.nextInt();
        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i = 0; i < n; i++) {
            entrada.nextLine();
            System.out.println("Dados da " +  (i + 1) + " pessoa: ");
            System.out.print("Nome: ");
            nomes[i] = entrada.nextLine();
            System.out.print("Idade: ");
            idades[i] = entrada.nextInt();
        }

        double maior = idades[0];
        int posMaior = 0;
        for (int i = 0; i < n; i++) {
            if (idades[i] > maior) {
                maior = idades[i];
                posMaior = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s\n", nomes[posMaior]);

        entrada.close();
    }
}
