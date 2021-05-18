import models.Question;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class QuestionTest {
    public Question question = Question.loadNewQuestion();

    @Test
    public void questionFileReturnsCorrectFields() {
        assertNotNull(question.getQuestion());
        assertNotNull(question.getAnswer());
    }

}