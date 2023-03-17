package javaOOPadvanced._9;

public class Boat implements Movable {

    @Override
    public void moveForward() {
        System.out.println("Surfing forward!!!");
    }

    @Override
    public void moveBackward() {
        System.out.println("Surfing backward!!!");
    }
}
