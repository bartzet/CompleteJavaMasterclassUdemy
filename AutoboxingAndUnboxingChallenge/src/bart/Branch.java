package bart;

import java.util.ArrayList;

/**
 * Created by Dell on 2017-11-27.
 */
public class Branch {

    private String name;
    private ArrayList<Customers> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customers>();
    }

    public String getName() {
        return name;
    }

    public boolean newCustomer (String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customers(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction (String customerName, double amount) {
        Customers existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }
}
