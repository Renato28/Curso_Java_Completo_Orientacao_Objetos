package exercicios;

import java.util.Scanner;

public class ExercicioProposto01 {

    static void main() {

        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();

        if (numero < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NÃO NEGATIVO");
        }

        entrada.close();
    }
}
