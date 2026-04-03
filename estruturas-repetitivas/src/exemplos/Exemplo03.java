package exemplos;

import java.util.Scanner;

public class Exemplo03 {

    static void main() {
        Scanner entrada =  new Scanner(System.in);
        int x = entrada.nextInt();

        int soma = 0;

        while(x != 0) {
            soma += x;
            x = entrada.nextInt();
        }

        System.out.println(soma);
        entrada.close();
    }
}
