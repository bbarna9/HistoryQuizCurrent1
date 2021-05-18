import models.Quiz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuizTest {

    @Test
    public void winnerSelecterWhenGivenAcceptableResultsTest() {
        int correctAnswer = 40;
        int user1Answer = 30;
        int user2Answer = 20;
        assertEquals("Player1", Quiz.calculateScores(correctAnswer, user1Answer, user2Answer));
    }

    @Test
    public void winnerSelecterWhenGivenNullResultTest() {
        int correctAnswer = 40;
        int user1Answer = 0;
        int user2Answer = 100000;
        assertEquals("Player2", Quiz.calculateScores(correctAnswer, user1Answer, user2Answer));
    }
}
