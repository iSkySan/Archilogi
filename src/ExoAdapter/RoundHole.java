package ExoAdapter;

public class RoundHole {
    private double radius;

    public RoundHole() {
    }

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        return this.getRadius() >= peg.getRadius();
    }

    public String toString() {
        return "RoundHole{" +
                "radius=" + radius +
                '}';
    }
}
