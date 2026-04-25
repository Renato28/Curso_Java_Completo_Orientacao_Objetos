package exemplo.heranca05.application;

import exemplo.heranca05.entities.Circle;
import exemplo.heranca05.entities.Rectangule;
import exemplo.heranca05.entities.Shape;
import exemplo.heranca05.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangule ou Circle (r/c)? ");
            char choice = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if (choice == 'r') {
                System.out.print("With: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                shapes.add(new Rectangule(color, width, height));
            }
            else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                shapes.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape s : shapes) {
            System.out.println(String.format("%.2f", s.area()));
        }

        sc.close();
    }
}
