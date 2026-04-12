package exercicio_fixacao;

import java.util.Scanner;

public class Program {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("How many rooms will be rented? ");
        int n = entrada.nextInt();
        Rent[] vect = new Rent[10];

        for (int i = 1; i <= n; i++) {
            entrada.nextLine();
            System.out.println("Rent # " + i + ": ");
            System.out.print("Name: ");
            String name = entrada.nextLine();
            System.out.print("Email: ");
            String email = entrada.nextLine();
            System.out.print("Room: ");
            int room = entrada.nextInt();
            vect[room] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        entrada.close();
    }
}
