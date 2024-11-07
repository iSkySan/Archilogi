package Composite;

import java.util.List;

public class CompoundGraphic implements Graphic {
    private int x;
    private int y;
    private List<Graphic> children;

    public CompoundGraphic(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void add(Graphic child) {
        children.add(child);
    }

    public void remove(Graphic child) {
        children.remove(child);
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        for (Graphic child : children) {
            child.move(x, y);
        }
    }

    @Override
    public void draw() {
        for (Graphic child : children) {
            child.draw();
        }
    }
}