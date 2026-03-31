package exemplos;

public class Exemplo3 {

    static void main() {

        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2.0 * h;

        System.out.println("Area: " + area);

        // Boa prática
        // Sempre indique o tipo do numero, se a expressao for de ponto flutuante (não inteira)

        // Para double use:
        // .0

        // Para float use:
        // f

//        float b, B, h, area;
//        b = 6f;
//        B = 8f;
//        h = 5f;
//        area = (b + B) / 2f * h;
//        System.out.println(area);
    }
}
