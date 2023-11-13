package org.example;

public class Square {
    private int side;

    public Square(int side) {
        setSide(side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side >= 0) {
            this.side = side;
        } else {
            throw new IllegalArgumentException("Side must be a non-negative integer");
        }
    }

    public int computeArea() {
        return side * side;
    }
}
