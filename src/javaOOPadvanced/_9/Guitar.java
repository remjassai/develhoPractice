package javaOOPadvanced._9;

public class Guitar extends Instrument implements Playable{
    //Create classes called "Guitar" that extend the Instrument class and implement the play() method.
    protected Guitar(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
        System.out.println("This " + this.getBrand() + " guitar is playing!");
    }
}
