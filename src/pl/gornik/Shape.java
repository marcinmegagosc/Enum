package pl.gornik;

public class Shape {

    private String name;
    private char size;

    private ColorType color;

    public Shape(String name, char size, ColorType color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }

    public ColorType getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", color=" + color.getColor() +
                '}';
    }
}
