package bart;

public class Main {

    public static void main(String[] args) {
        Account bartAccount = new Account();

        bartAccount.setAccountNumber(98752532);
        bartAccount.setCustomerName("Bart Ziemba");
        bartAccount.setEmail("bart@bart.bart");
        bartAccount.setPhoneNumber(178946577);
        bartAccount.depositFunds(150.0);
        bartAccount.withdrawFunds(100.0);

        Account bartAccountWitConstructor = new Account(12345679, 2345.4, "Bart Ziemba", "bart@bart.bart", 8714833);

        System.out.println(bartAccountWitConstructor.getAccountBalance());
        System.out.println(bartAccountWitConstructor.getAccountBalance());
        System.out.println(bartAccountWitConstructor.getCustomerName());
        System.out.println(bartAccountWitConstructor.getEmail());
        System.out.println(bartAccountWitConstructor.getPhoneNumber());
    }
}
