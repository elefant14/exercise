package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private String name;
    private double lenghtA;
    private double lenghtH;


    public Triangle(double lenghtA, double lenghtH) {
        this.lenghtA = lenghtA;
        this.lenghtH = lenghtH;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.lenghtA, lenghtA) == 0 &&
                Double.compare(triangle.lenghtH, lenghtH) == 0 &&
                name.equals(triangle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lenghtA, lenghtH);
    }

    public String getShapeName() {
        return name;
    }

    public double getField() {
        return  lenghtA * lenghtH/2;
    }
}


