package exercicios;

import java.util.Scanner;

public class ExercicioProposto02 {

    static void main() {

        Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();
        int y = entrada.nextInt();

        while(x != 0 || y != 0){

            if(x > 0 && y > 0){
                System.out.println("Primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            }
            else {
                System.out.println("Quarto");
            }

            x = entrada.nextInt();
            y = entrada.nextInt();
        }

        entrada.close();
    }
}
