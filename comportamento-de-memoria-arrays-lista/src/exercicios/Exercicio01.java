package exercicios;

import java.util.Scanner;

public class Exercicio01 {

    static void main() {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int n = entrada.nextInt();
        int[] vect = new int[n];

        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = entrada.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for(int i = 0; i < vect.length; i++){
            if (vect[i] < 0){
                System.out.println(vect[i]);
            }

            entrada.close();
        }
    }


}
