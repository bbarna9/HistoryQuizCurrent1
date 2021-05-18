package models;

import org.tinylog.Logger;

import java.util.Random;


/**
 * The Question model is the base of the entire program. It consists of two Strings: a question and an answer.
 * The class itself contains the getters-and-setters, and the {@code loadNewQuestion()} function. This instantiates
 * an {@link PersonalXmlReader} with a random number passed to it as a parameter, and we pass that randomly loaded question
 * on to the question, and return with the question itself.
 */
public class Question {

    private String question;
    private String answer;

    /**
     * Getter of the question text inside the Question model
     * @return string, that contains the question itself.
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Setter of the question text inside the Question model
     * @param question, as we are giving it a new value.
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * Getter of the answer text inside the Question model
     * @return string, that contains the answer itself.
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * Setter of the answer text inside the Question model
     * @param answer, as we are giving it a new value.
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     * In this function we are instantiating a new Question model, then an {@link models.PersonalXmlReader} model.
     * From here on we are passing a randomly generated number between 0 and 69 (that's because our XML file only
     * contains 70 questions as of now) and it wil load back a question that's on that given index.
     * @return with a String array, which consists of a question text and an answer text.
     */
    public static Question loadNewQuestion(){
        Question question = new Question();
        Random random = new Random();
        int rand = random.nextInt(70);
        Logger.info("Passing randomly generated Integer to the XML reader.");
        PersonalXmlReader reader = new PersonalXmlReader();
        String[] data = reader.XmlReader(rand);
        question.setQuestion(data[0]);
        question.setAnswer(data[1]);
        return question;
    }
}