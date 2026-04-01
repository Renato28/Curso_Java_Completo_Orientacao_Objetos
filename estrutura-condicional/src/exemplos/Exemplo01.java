package exemplos;

import java.util.Scanner;

public class Exemplo01 {

    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();
        String dia;

        if (x == 1) {
            dia = "domingo";
        } else if (x == 2) {
            dia = "segunda";
        } else if (x == 3) {
            dia = "terça";
        } else if (x == 4) {
            dia = "quarta";
        } else if (x == 5) {
            dia = "quinta";
        } else if (x == 6) {
            dia = "sexta";
        } else if (x == 7) {
            dia = "sabado";
        } else {
            dia = "valor inválido";
        }
        System.out.println("Dia da semana: " + dia);
        entrada.close();
    }
}
