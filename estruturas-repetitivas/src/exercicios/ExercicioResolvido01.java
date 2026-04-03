package exercicios;

import java.util.Scanner;

public class ExercicioResolvido01 {

    static void main() {

        Scanner entrada = new Scanner(System.in);

        int X = entrada.nextInt();
        int Y = entrada.nextInt();

        while (X != Y) {
            if (X < Y) {
                System.out.println("Crescente");
            }
            else {
                System.out.println("Decrescente");
            }
            X = entrada.nextInt();
            Y = entrada.nextInt();
        }

        entrada.close();

    }
}
