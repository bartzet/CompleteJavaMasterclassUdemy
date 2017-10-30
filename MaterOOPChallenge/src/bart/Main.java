package bart;

public class Main {

    public static void main(String[] args) {
        BaseBurger baseBurger = new BaseBurger("basic", "wholegrain", "pulled pork", 8.40);
        double price = baseBurger.itemizeBurger();
        baseBurger.addHamburgerBacon("Bacon", 2.20);
        baseBurger.addHamburgerCheese("Cheese", 1.50);
        baseBurger.addHamburgerLettuce("Lettuce", 0.5);
        baseBurger.addHamburgerOnion("Onion", 0.4);
        price = baseBurger.itemizeBurger();
        System.out.println("Total burger price is " + baseBurger.itemizeBurger());

        HealthyBurger healthyBurger = new HealthyBurger();
    }
}
