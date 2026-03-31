package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

    static void main() {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entrada:");

        int cod1, cod2, qte1, qte2;
        double preco1, preco2, total;

        cod1 = entrada.nextInt();
        qte1 = entrada.nextInt();
        preco1 = entrada.nextDouble();

        cod2 = entrada.nextInt();
        qte2 = entrada.nextInt();
        preco2 = entrada.nextDouble();

        total = preco1 * qte1 + preco2 * qte2;
        System.out.println("Saida:");
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

    }
}
