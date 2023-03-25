package javaOOPadvanced._9;

public class Piano extends Instrument implements Playable{
    //Create classes called "Piano" that extend the Instrument class and implement the play() method.
    protected Piano(String name, String brand) {
        super(name, brand);
    }
    @Override
    public void play(){
        System.out.println("Your old " + this.getBrand() + " piano is playing!");
    }

}
