package javaOOPadvanced._9;

public class Car implements Movable{

    @Override
    public void moveForward() {
        System.out.println("Moving forward!!!");
    }

    @Override
    public void moveBackward() {
        System.out.println("Moving backwards!!!");
    }
}
