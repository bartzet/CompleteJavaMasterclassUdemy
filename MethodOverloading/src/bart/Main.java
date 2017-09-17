package bart;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Bartek", 10);
        System.out.println("New score " + newScore);
        int newestScore = calculateScore(75);
        System.out.println("Newest score is " + newestScore);
        calculateScore();

        calcFeetAndInchesToCentimeters(2, 2);
        calcFeetAndInchesToCentimeters(157);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no playes score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        //12 inches in 1 foot / 1 inch = 2.54cm

        //zamiana feet na inche i na centymetry
        double centimeters = (feet * 12) * 2.54;
        // zamiana inchy na centymetry
        centimeters += inches + 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + "cm.");
        return (int) centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " include " + feet + " feet and " + remainingInches + " inches");

        return calcFeetAndInchesToCentimeters(feet, remainingInches);

    }

}
