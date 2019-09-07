package com.kodilla.testing.shape;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ShapeCollector<shapeCollection> {
    private List<Shape> shapeCollection = new List<>();
    List<Shape> getShapeCollection;
    return shapeCollection;

    public void addFigure(Shape shape) {
        shapeCollection.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapeCollection.remove(shape);
    }

    public void getFigure(int n) {
        if (n < shapeCollection.size() && n >= 0) {
            Shape shape = shapeCollection.get(n);
            return shape;
        }
    }

    public void showFigures(){
        System.out.println(shapeCollection.toString());
    }
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @NotNull
        @Override
        public Iterator<Shape> iterator() {
            return null;
        }

        @NotNull
        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @NotNull
        @Override
        public <T> T[] toArray(@NotNull T[] a) {
            return null;
        }

        @Override
        public boolean add(Shape shape) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(@NotNull Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(@NotNull Collection<? extends Shape> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, @NotNull Collection<? extends Shape> c) {
            return false;
        }

        @Override
        public boolean removeAll(@NotNull Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(@NotNull Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Shape get(int index) {
            return null;
        }

        @Override
        public Shape set(int index, Shape element) {
            return null;
        }

        @Override
        public void add(int index, Shape element) {

        }

        @Override
        public Shape remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @NotNull
        @Override
        public ListIterator<Shape> listIterator() {
            return null;
        }

        @NotNull
        @Override
        public ListIterator<Shape> listIterator(int index) {
            return null;
        }

        @NotNull
        @Override
        public List<Shape> subList(int fromIndex, int toIndex) {
            return null;
        }
    }
}
