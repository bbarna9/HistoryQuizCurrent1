import models.PersonalXmlReader;
import models.Question;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class XmlReaderTest {
    int randomNumberSubstitute = 10;
    public String[] reader;
    public Question question = new Question();

    @BeforeEach
    public void loadingQuestion() throws Exception {
        PersonalXmlReader readerModel = new PersonalXmlReader();
        reader = readerModel.XmlReader(randomNumberSubstitute);
        question.setQuestion(reader[0]);
        question.setAnswer(reader[1]);
    }

    @Test
    public void questionFileReturnsCorrectFields() {
        assertNotNull(question.getQuestion());
        assertNotNull(question.getAnswer());
    }

    @Test
    public void questionReturnsCorrectData() {
        assertEquals("Melyik évben lépett életbe XIII. Gergely pápa naptárreformja?", question.getQuestion());
        assertEquals("1582", question.getAnswer());
    }
}