package execiciofixacao.application;

import execiciofixacao.entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double amount = sc.nextDouble();

        double realPrice = CurrencyConverter.converter(dollarPrice, amount);

        System.out.printf("Amount to be paid in reais = %.2f%n", realPrice);

        sc.close();
    }
}
