package javaOOPadvanced._9;


public class Circle extends Shape{

    public Circle(double height, double width){
        super(height, width);
        if(height!= width) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow((this.getHeight() / 2), 2);
    }

}
