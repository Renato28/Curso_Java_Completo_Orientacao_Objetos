package exercicios;

import java.util.Scanner;

public class ExercicioProposto03 {

    static void main() {

        Scanner entrada = new Scanner(System.in);

        int numero1 =  entrada.nextInt();
        int numero2 = entrada.nextInt();

        if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
            System.out.println("São Multiplos");
        } else {
            System.out.println("Não são Multiplos");
        }

        entrada.close();
    }

}
