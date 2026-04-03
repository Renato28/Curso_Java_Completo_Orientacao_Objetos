package exercicios;

import java.util.Scanner;

public class ExercicioProposto03 {

    static void main() {

        Scanner entrada = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int opcao = entrada.nextInt();

        while (opcao != 4) {
            if (opcao == 1) {
                alcool = alcool + 1;
            } else if (opcao == 2) {
                gasolina = gasolina + 1;
            } else {
                diesel = diesel + 1;
            }

            opcao = entrada.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        entrada.close();
    }

}
