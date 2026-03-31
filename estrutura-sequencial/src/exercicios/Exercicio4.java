package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

    static void main() {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entrada:");
        int numeroFuncionario = entrada.nextInt();
        int horasTrabalhadas = entrada.nextInt();
        double valorTrabalhadoPorHora = entrada.nextDouble();
        double salario = horasTrabalhadas * valorTrabalhadoPorHora;

        System.out.println("Saida:");
        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}
