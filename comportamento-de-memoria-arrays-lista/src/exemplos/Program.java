package exemplos;

public class Program {

    // Laço "for each"

    // Sintaxe opcional e simplificada para percorrer coleções

    // Sintaxe:

    /*
    for (Tipo apelido : coleção) {
        <comando 1>
        <comando 2>
    }
     */

    // Demo

    static void main() {

        // Leitura: "para cada objeto 'obj' contido em vect, faça:"
        String[] vect = new String[] {"Maria", "Bob", "Alex"};

//        for (int i = 0; i < vect.length; i++) {
//            System.out.println(vect[i]);
//        }

        for (String obj : vect) {
            System.out.println(obj);
        }
    }
}
