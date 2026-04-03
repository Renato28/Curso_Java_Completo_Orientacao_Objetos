package exercicios;

import java.util.Scanner;

public class ExercicioResolvido04 {

    static void main() {

        Scanner entrada = new  Scanner(System.in);

        int N =  entrada.nextInt();

        for (int i = 1; i <= 10; i++) {
            int produto = i * N;
            System.out.println(i + " x " + N + " = " + produto);
        }

        entrada.close();
    }
}
