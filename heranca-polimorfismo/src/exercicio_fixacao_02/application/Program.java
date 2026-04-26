package exercicio_fixacao_02.application;

import exercicio_fixacao_02.entities.Pessoa;
import exercicio_fixacao_02.entities.PessoaFisica;
import exercicio_fixacao_02.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual ou company (i/c)? ");
            char choice = sc.next().charAt(0);
            if (choice == 'i') {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Anual income: ");
                Double annualIncome = sc.nextDouble();
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                pessoas.add(new PessoaFisica(name, annualIncome, healthExpenditures));
            } else {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Anual income: ");
                Double annualIncome = sc.nextDouble();
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();
                pessoas.add(new PessoaJuridica(name, annualIncome, employees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID: ");
        for (Pessoa p : pessoas) {
            System.out.println(p.getName() + ": $ " + String.format("%.2f", p.calculateTax()));
        }

        double sum = 0.0;
        for (Pessoa p : pessoas) {
            sum += p.calculateTax();
        }

        System.out.print("TOTAL TAXES: $ " + String.format("%.2f", sum));
    }
}
