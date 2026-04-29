package exercicio_fixacao.application;

import exercicio_fixacao.exceptions.RegraDeNegocioException;
import exercicio_fixacao.model.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double limit = sc.nextDouble();

            Account account = new Account(number, holder, initialBalance, limit);

            System.out.println();

            System.out.print("Enter amount for withdraw: ");
            Double amount = sc.nextDouble();
            try {
                account.withdraw(amount);
                System.out.println("New balance: " + account.getBalance());

            } catch (RegraDeNegocioException e) {
            System.out.println("Withdraw error: "  + e.getMessage());
        }
        sc.close();
    }
}
