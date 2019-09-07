package com.kodilla.testing.shape;

import org.jetbrains.annotations.NotNull;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.IntStream;

public class Square implements Shape {
    private String name;
     private double lenghtA;
    public Square(double aLenght) {
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


}
