package bart;

/**
 * Created by Dell on 2017-10-18.
 */
public class BaseBurger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String onion;
    private double onionPrice;

    private String cheese;
    private double cheesePrice;

    private String lettuce;
    private double lettucePrice;

    private String bacon;
    private double baconPrice;

    public BaseBurger(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public void addHamburgerOnion(String name, double price) {
        this.onion = name;
        this.onionPrice = price;
    }

    public void addHamburgerCheese(String name, double price) {
        this.cheese = name;
        this.cheesePrice = price;
    }

    public void addHamburgerLettuce(String name, double price) {
        this.lettuce = name;
        this.lettucePrice = price;
    }

    public void addHamburgerBacon(String name, double price) {
        this.bacon = name;
        this.baconPrice = price;
    }

    public double itemizeBurger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + "on a " + this.breadRollType + " roll " + "with " + this.meat
                + ", price is " + this.price);
        if (this.onion != null) {
            hamburgerPrice += this.onionPrice;
            System.out.println("Added " + this.onion + " for an extra " + this.onionPrice);
        }
        if (this.cheese != null) {
            hamburgerPrice += this.cheesePrice;
            System.out.println("Added " + this.cheese + " for an extra " + this.cheesePrice);
        }
        if (this.lettuce != null) {
            hamburgerPrice += this.lettucePrice;
            System.out.println("Added " + this.lettuce + " for an extra " + this.lettucePrice);
        }
        if (this.bacon != null) {
            hamburgerPrice += this.baconPrice;
            System.out.println("Added " + this.bacon + " for an extra " + this.baconPrice);
        }

        return hamburgerPrice;
    }
}
