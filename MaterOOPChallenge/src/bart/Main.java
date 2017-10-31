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

        HealthyBurger healthyBurger = new HealthyBurger("Turkey", 6.40);
        healthyBurger.addHamburgerOnion("Onion", 0.40);
        healthyBurger.addHealthyAddition1("Avocado", 1.70);
        System.out.println("Total healthy burger price is " + healthyBurger.itemizeBurger());


        DeluxBurger deluxBurger = new DeluxBurger();
        deluxBurger.itemizeBurger();
    }
}
