package aula;

import java.util.Locale;

public class AulaSobreSaidaDeDados {

    static void main(String[] args) {

        // Sem quebra de linha no final
        System.out.print("Bom dia!");

        // Com quebra de linha no final
        System.out.println("Bom dia!");

        // Para escrever o conteúdo de uma variável de algum tipo básico
        // Suponha uma variável tipo int declarada e iniciada:
        int y = 32;

        System.out.println(y);

        // Para escrever o conteúdo de uma variável com ponto flutuante
        // Suponha uma variável tipo double declara e iniciada:
        // %n = quebra de linha (independente de plataforma)

        double x = 10.35784;

        System.out.println(x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);

        // Para concatenar vários elementos em um mesmo comando de escrita
        // Regra geral para print e println:
        // elemento1 + elemento3 + elemento3 + ... elementoN

        System.out.println("RESULTADO = " + x + " METROS");

        // Para concatenar vários elementos em um mesmo comando de escrita
        // Regra geral para printf:
        // "TEXTO1 %f TEXTO2 %f TEXTO3", variavel1, variavel2
        // %f = ponto flutuante
        // %n = quebra de linha

        System.out.printf("RESULTADO = %.2f metros%n", x);

        // Para concatenar vários elementos em um mesmo comando de escrita
        // Regra geral para printf:

        // "TEXTO1 %f TEXTO2 %f TEXTO3, variavel1, variavel2"
        // %f = ponto flutuante
        // %d - inteiro
        // %s = texto
        // %n - quebra de linha

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

    }
}
