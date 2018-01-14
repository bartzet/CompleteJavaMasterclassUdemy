package bart;

import java.util.ArrayList;

/**
 * Created by Dell on 2017-11-27.
 */
public class Customers {
    private String name;
    private ArrayList<Double> transactions;

    public Customers(String name, double initialAmount) {
        this.transactions = new ArrayList<Double>();
        this.name = name;
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
