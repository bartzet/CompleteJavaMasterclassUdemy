package bart;

/**
 * Created by Dell on 2017-10-18.
 */
public class DeluxBurger extends BaseBurger {

    @Override
    public void addHamburgerOnion(String name, double price) {
        System.out.println("Cannot add additional items to delux burger");
    }

    @Override
    public void addHamburgerCheese(String name, double price) {
        System.out.println("Cannot add additional items to delux burger");
    }

    @Override
    public void addHamburgerLettuce(String name, double price) {
        System.out.println("Cannot add additional items to delux burger");
    }

    @Override
    public void addHamburgerBacon(String name, double price) {
        System.out.println("Cannot add additional items to delux burger");
    }

    public DeluxBurger() {
        super("Delux", "White", "Sausage&Bacon", 14.54);
        addHamburgerBacon("Chips", 2.75);
        addHamburgerOnion("Drink", 1.50);


    }
}
