package testing.shape;

import java.util.Objects;

public class Square implements Shape {
    private String name;
     private double lenghtA;
    public Square(double lenghtA) {
        this.lenghtA = lenghtA;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.lenghtA, lenghtA) == 0 &&
                name.equals(square.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lenghtA);
    }

    public String getShapeName() {
        return name;
    }


    public double getField() {
        return Math.pow(lenghtA, 2);
    }
}
