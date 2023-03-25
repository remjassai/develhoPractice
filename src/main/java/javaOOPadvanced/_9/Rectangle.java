package javaOOPadvanced._9;

public class Rectangle extends Shape{

    public Rectangle(double height, double width) {
        super(height, width);
    }

    @Override
    public double calculateArea() {
        return this.getHeight() * this.getWidth();
    }
}
