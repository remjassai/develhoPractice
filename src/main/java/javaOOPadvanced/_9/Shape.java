package javaOOPadvanced._9;

public abstract class Shape {
    private double height;
    private double width;

    public Shape(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }



    public abstract double calculateArea();
}
