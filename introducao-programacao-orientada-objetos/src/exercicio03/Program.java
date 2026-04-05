package exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        student.nome = sc.nextLine();

        student.nota1 = sc.nextDouble();
        student.nota2 = sc.nextDouble();
        student.nota3 = sc.nextDouble();

        double soma = student.nota1 + student.nota2 + student.nota3;
        if (soma > 60.0) {
            System.out.printf("FINAL GRADE = %.2f\n", soma);
            System.out.println("PASS");
        } else {
            double restante = 60.0 - soma;
            System.out.printf("FINAL GRADE = %.2f\n", soma);
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", restante);
        }

    }
}
