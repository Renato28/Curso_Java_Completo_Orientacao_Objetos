package exemplos;

import java.util.Scanner;

public class Exemplo02 {
    
    static void main() {
        Scanner entrada = new  Scanner(System.in);
        int x = entrada.nextInt();
        String dia;
        
        switch (x) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case  4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sabado";
                break;
            default:
                dia = "valor invalido";
                break;
        }

        System.out.println("Dia da semana: " + dia);
        entrada.close();
    }
}
