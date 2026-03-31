package exercicios;

import java.util.Scanner;

public class ExercicioProposto02 {

    static void main() {

        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        entrada.close();
    }
}
