package herdar_vs_cumprir_contrato.model.entities.application;

import herdar_vs_cumprir_contrato.model.entities.AbstractShape;
import herdar_vs_cumprir_contrato.model.entities.Circle;
import herdar_vs_cumprir_contrato.model.entities.Rectangule;
import herdar_vs_cumprir_contrato.model.enums.Color;

public class Program {

    static void main() {

        AbstractShape s1 = new Circle(Color.BLACK, 2.0);
        AbstractShape s2 = new Rectangule(Color.WHITE, 3.0, 4.0);

        System.out.println("Circle color: " + s1.getColor());
        System.out.println("Circle area: " + String.format("%.3f", s1.area()));
        System.out.println("Rectangule color: " +  s2.getColor());
        System.out.println("Rectangule area: " + String.format("%.3f", s2.area()));
    }
}
