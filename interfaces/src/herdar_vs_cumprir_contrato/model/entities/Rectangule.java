package herdar_vs_cumprir_contrato.model.entities;

import herdar_vs_cumprir_contrato.model.enums.Color;

public class Rectangule extends AbstractShape {

    private Double width;
    private Double height;

    public Rectangule(Color color) {
        super(color);
    }

    public Rectangule(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return width * height;
    }
}
