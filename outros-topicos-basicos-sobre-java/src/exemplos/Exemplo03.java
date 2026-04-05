package exemplos;

import java.util.Scanner;

public class Exemplo03 {

    static void main() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();

        int higher = max(a, b, c);

        showResult(higher);

        entrada.close();
    }

    public static void showResult(int value) {
        System.out.println("Higher: " + value);
    }

    public static int max(int x, int y, int z) {
        int aux;
        if (x > y & x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }

        return aux;

    }
}
