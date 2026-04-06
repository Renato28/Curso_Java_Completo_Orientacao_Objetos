package application;

import entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit? y/n: ");
        char opcao = sc.next().charAt(0);

        if (opcao == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            conta =  new Conta(number, holder, initialDeposit);
            System.out.println("Updated account data: ");

        } else {
            conta = new Conta(number, holder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        conta.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        conta.withdraw(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(conta);

    }
}
