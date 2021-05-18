package models;

/**
 * The {@code Quiz} class "represents" the game logic behind the game. Unfortunately, since the game I chose is
 * mostly related to the FXML, the only thing I could have declared here was the point calculation. But since the rest
 * of the game is (as I already mentioned) FXML related, I think this is not the only logic that CAN but the only logic
 * that SHOULD be implemented here.
 */
public class Quiz {

    private static final int maxQuestion = 1;
    private static final int MAXVALUE = 1000000;
    private static final int startingTime = 5;
    private static int seconds = startingTime;
    public static int temp1;
    public static int temp2;

    /**
     * This function calculates who's guessing is closer to the right answer, and with this deciding who gets the point for
     * this round. We substract the guesses given to the function as a parameter from the correct answer, by this achieving
     * the "distance" each player was from guessing the correct number. If these substractions were to be less then 0 (in case
     * of the guessed number being bigger then the correct one) we multiply the {@code temp} number with -1, with this achieving
     * only calculating with positive numbers. Then we check who wrote something and who didn't, because if a person didn't guess
     * anything, they lose the round immediately.
     * @param correctAnswer
     * @param playerAnswer1
     * @param playerAnswer2
     * @return with a String that contains which player won.
     */
    public static String calculateScores(int correctAnswer, int playerAnswer1, int playerAnswer2) {
        String winner = "Noone";

        temp1 = correctAnswer - playerAnswer1;
        temp2 = correctAnswer - playerAnswer2;

        if (temp1 < 0) {
            temp1 = temp1 * -1;
        }

        if (temp2 < 0) {
            temp2 = temp2 * -1;
        }

        if (temp1 < temp2) {
            if (playerAnswer1 == 0) {
                if (playerAnswer2 != 0) {
                    winner = "Player2";
                } else {
                    //No one won
                }
            } else {
                winner = "Player1";
            }

        } else if (temp2 < temp1) {
            if (playerAnswer2 == 0) {
                if (playerAnswer1 != 0) {
                    winner = "Player1";
                } else {
                //No one won
            }
            } else {
                winner = "Player2";
            }

        } else {
            //Do nothing
        }

        return winner;
    }
}
