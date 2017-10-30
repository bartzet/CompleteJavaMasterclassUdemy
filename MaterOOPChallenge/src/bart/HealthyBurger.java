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
        super("Healthy", "Brown rye", meat, price);
    }

    public addHealthyAddition1(String name, double price) {
        this.healthyExtraName = name;
        this.healthyExtraPrice = price;
    }

    public addHealthyAddition2(String name, double price) {
        this.healthyExtraName2 = name;
        this.healthyExtraPrice2 = pricx xe;
    }
}
