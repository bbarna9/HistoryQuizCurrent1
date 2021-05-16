package models;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

/**
 * The {@code personalXmlReader} class executes the question loading. This is achieved by loading in the entire
 * {@code questions.xml} file, and then selecting one specific question from the list, the one which's id equals
 * with the number passed to the function as a parameter. After the question was selected, the function returns with it.
 */
public class PersonalXmlReader {

    public String[] XmlReader(int temp){
        String tempQ = "Error while loading question";
        String tempA = "Error while loading answer";

        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(getClass().getResourceAsStream("/xml/questions.xml"));
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("element");

            Node nNode = nList.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                tempQ = eElement.getElementsByTagName("text").item(0).getTextContent();
                tempA = eElement.getElementsByTagName("answer").item(0).getTextContent();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        String[] selectedQuestion = new String[] {tempQ, tempA};
        return selectedQuestion;
    }
}
