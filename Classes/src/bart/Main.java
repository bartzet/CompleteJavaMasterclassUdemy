package bart;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("Carrera");
        System.out.println("Car model is " + porsche.getModel());


        Account bartAccount = new Account();
        bartAccount.setAccountNumber(98752532);
        bartAccount.setCustomerName("Bart Ziemba");
        bartAccount.setEmail("bart@bart.bart");
        bartAccount.setPhoneNumber(178946577);

        
        bartAccount.depositFunds(150.0);
        bartAccount.withdrawFunds(100.0);

    }

}
