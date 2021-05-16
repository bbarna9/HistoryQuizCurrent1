package models;

import models.personalXmlReader;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * The Question model is the base of the entire program. It consists of two Strings: a question and an answer.
 * The class itself contains the getters-and-setters, and the {@code loadNewQuestion()} function. This instantiates
 * an {@link personalXmlReader} with a random number passed to it as a parameter, and we pass that randomly loaded question
 * on to the question, and return with the question itself.
 */

@Slf4j
public class Question {

    private String question;
    private String answer;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public static Question loadNewQuestion(){
        Question question = new Question();
        Random random = new Random();
        int rand = random.nextInt(70);
        personalXmlReader reader = new personalXmlReader();
        String[] data = reader.XmlReader(rand);
        question.setQuestion(data[0]);
        question.setAnswer(data[1]);
        return question;
    }
}