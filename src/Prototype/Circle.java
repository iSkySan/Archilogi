package Prototype;

public class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    public Shape clone() {
        return new Circle(this);
    }

    public String toString() {
        return "Circle{" +
                "x=" + getX() +
                ", y=" +getY() +
                ", color='" + getColor() + '\'' +
                ", radius=" + radius +
                '}';
    }
}