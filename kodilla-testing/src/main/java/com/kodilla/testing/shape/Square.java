package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape{
    private String name;
    private double lengthA;

    public Square(double lenghtA) {
        this.lengthA = lenghtA;
    }

    public String getShapeName() {
        return name;
    }


    public double getField() {
        return Math.pow(lengthA, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return Double.compare(square.lengthA, lengthA) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lengthA);
    }
}
