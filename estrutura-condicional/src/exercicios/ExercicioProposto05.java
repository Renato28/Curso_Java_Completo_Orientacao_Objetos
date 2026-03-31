package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto05 {

    static void main() {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int codigo = entrada.nextInt();
        int quantidade = entrada.nextInt();
        double total;

        if (codigo == 1) {
            total = quantidade * 4.00;
            System.out.printf("Total: R$ %.2f%n " , total);
        } else if (codigo == 2) {
            total = quantidade * 4.50;
            System.out.printf("Total: R$ %.2f%n" , total);
        } else if (codigo == 3) {
            total = quantidade * 5.00;
            System.out.printf("Total: R$ %.2f%n" , total);
        } else {
            total = quantidade * 1.50;
            System.out.printf("Total: R$ %.2f%n" , total);
        }
    }
}
