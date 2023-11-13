package org.example;

public class Rectangle {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        setHeight(height);
        setWidth(width);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height >= 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Height must be a non-negative integer");
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width >= 0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width must be a non-negative integer");
        }
    }

    public int computeArea() {
        return height * width;
    }
}

