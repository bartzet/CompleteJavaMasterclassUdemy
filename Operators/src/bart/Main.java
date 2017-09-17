package bart;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println(result);

        int previousResult = result;

        result = result - 1;

        System.out.println(result );

        boolean isAlien = false;

        if (isAlien == false) {
            System.out.println("Is not an alien");
        } else {
            System.out.println("Is alien");
        }

        int topScore = 100;

        if (topScore == 100) {
            System.out.println("You got the fits score which is =" + topScore);
        }

        int secondTopScore = 81;

        if ((topScore > secondTopScore) && (secondTopScore < 100)) {
            System.out.println("Second top score");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("One of tests are true");
        }

        boolean isCar = false;

        if (isCar == true) {
            System.out.println("This should not happen");
        }
        // ternary operator
        boolean wasCar = isCar ? true : false;


        double firstValue = 20;
        double secondValue = 80;

        double addAndMultiply = (firstValue + secondValue) * 25;

        double reminder = addAndMultiply % 40;
        System.out.println(reminder);

        if (reminder <= 20) {
            System.out.println("Total was over the limit");
        } else {
            System.out.println("Total wasn't over the limit");
        }

    }
}
