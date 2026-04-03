package exercicios;

import java.util.Scanner;

public class ExercicioProposto10 {

    static void main() {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();

        for(int i = 1; i <= n; i++){
            int primeiro = i;
            int segundo = (int) Math.pow(i, 2);
            int terceiro = (int) Math.pow(i, 3);
            System.out.printf("%d %d %d\n", primeiro, segundo, terceiro);
        }
    }
}
