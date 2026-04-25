package exemplo.heranca05.entities;

import exemplo.heranca05.entities.enums.Color;

public class Rectangule extends Shape {

    public Double width;
    public Double height;

    public Rectangule() {
        super();
    }

    public Rectangule(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return width * height;
    }
}
