package bart;

/**
 * Created by Dell on 2017-10-18.
 */
public class HealthyBurger extends BaseBurger {
    private String healthyExtraName;
    private double healthyExtraPrice;

    private String healthyExtraName2;
    private double healthyExtraPrice2;

    public HealthyBurger(String meat, double price) {
        super("Healthy", "Brown Rye", meat, price);
    }

     public void addHealthyAddition1(String name, double price) {
        this.healthyExtraName = name;
        this.healthyExtraPrice = price;
         System.out.println("Added " + this.healthyExtraName + " for an extra " + this.healthyExtraPrice);
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtraName2 = name;
        this.healthyExtraPrice2 = price;
        System.out.println("Added " + this.healthyExtraName2 + " for an extra " + this.healthyExtraPrice2);
    }

    @Override
    public double itemizeBurger() {
        double hamburgerPrice = super.itemizeBurger();
        if (this.healthyExtraName != null) {
            hamburgerPrice += this.healthyExtraPrice;
            System.out.println("Added " + healthyExtraName + " for an extra " + healthyExtraPrice);
        }

        if (this.healthyExtraName2 != null) {
            hamburgerPrice += this.healthyExtraPrice2;
            System.out.println("Added " + healthyExtraName2 + " for an extra " + healthyExtraPrice2);
        }

        return hamburgerPrice;
    }
}
