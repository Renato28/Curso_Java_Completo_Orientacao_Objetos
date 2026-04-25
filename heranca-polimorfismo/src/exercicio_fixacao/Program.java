package exercicio_fixacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {

    static void main() throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Product # " + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char opcao = sc.next().charAt(0);
            if (opcao == 'i') {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee));
            } else if (opcao == 'c') {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                products.add(new Product(name, price));
            } else {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());
                products.add(new UsedProduct(name, price, manufactureDate));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");

        for (Product p : products) {
            System.out.println(p.priceTag());
        }
    }
}
