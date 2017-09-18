package bart;

/**
 * Created by Dell on 2017-09-18.
 */
public class Dog extends Animal {

    //Additional characteristics of Dog
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    //base characteristics of Dog
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat(); called");
        chew();
        super.eat();
    }
}
