package exercicios;

import java.util.Scanner;

public class ExercicioResolvido04 {

    static void main() {

        Scanner entrada = new Scanner(System.in);

        int minutos = entrada.nextInt();
        double conta = 50.0;
        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }
        System.out.printf("Valor da conta = R$ %.2f%n" , conta);

        entrada.close();
    }
}
