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

    public BaseBurger(String name, String breadRollType, String meat, int price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public void addHamburgerOnion (String name, double price) {
        this.onion = name;
        this.onionPrice = price;
    }

    public void addHamburgerCheese (String name, double price) {
        this.cheese = name;
        this.cheesePrice = price;
    }

    public void addHamburgerLettuce (String name, double price) {
        this.lettuce = name;
        this.lettucePrice = price;
    }

    public void addHamburgerBacon (String name, double price) {
        this.bacon = name;
        this.baconPrice = price;
    }

    public double itemizeBurger() {
        double hamburgerPrice = this.price;

        
    }


}
