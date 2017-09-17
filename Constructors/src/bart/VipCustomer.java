package bart;


public class VipCustomer {

    private String name;
    private int creditLimit;
    private String email;

    public VipCustomer(String name, int creditLimit, String email) {
        System.out.println("VipCustomer with parameters called");
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer() {
        this("Bart", 10000, "bart@bart.bart");
        System.out.println("Default constructor called");
    }

    public VipCustomer(String email) {
        this("Bartosz", 20000, email);
    }


    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

}
