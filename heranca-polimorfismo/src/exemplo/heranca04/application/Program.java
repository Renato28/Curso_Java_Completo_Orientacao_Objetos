package exemplo.heranca04.application;

import exemplo.heranca04.entities.Account;
import exemplo.heranca04.entities.BusinessAccount;
import exemplo.heranca04.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

    static void main() {
        Locale.setDefault(Locale.US);
        List<Account> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
        accounts.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
        accounts.add(new SavingsAccount(1003, "Bob", 300.0, 0.01));
        accounts.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));

        double sum = 0.0;

        for (Account account : accounts) {
            sum += account.getBalance();
        }

        System.out.printf("Total balance: $.2f%n", sum);

        for (Account account : accounts) {
            account.deposit(10.0);
        }

        for (Account account : accounts) {
            System.out.printf("Updated balance for account %d: %.2f%n", account.getNumber(), account.getBalance());
        }
    }
}
