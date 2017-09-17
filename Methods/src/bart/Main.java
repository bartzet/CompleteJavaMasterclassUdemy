package bart;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("High score is " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        int newHighScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("New High score is " + newHighScore);


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Bart", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Ted", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Filip", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Gabriel", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Frank", highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }


    public static void displayHighScorePosition(String playersName, int highScorePosition) {
        System.out.println(playersName + " managed to get into position " + highScorePosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }


}