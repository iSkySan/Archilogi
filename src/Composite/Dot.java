package Composite;

import java.util.List;

public class Dot implements Graphic {
    private int x;
    private int y;

    @Override
    public void draw() {
        System.out.println("Drawing a dot at (" + x + ", " + y + ")");
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }
    public  String  toString() {
        return "Dot{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }



}
