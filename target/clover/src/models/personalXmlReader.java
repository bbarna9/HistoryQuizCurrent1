/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package models;

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
public class personalXmlReader {public static class __CLR4_4_1a5ya5ykorfooe7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0062\u0061\u0072\u006e\u0061\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0066\u0065\u006a\u0065\u006c\u0073\u007a\u0074\u0065\u0073\u002f\u0048\u0069\u0073\u0074\u006f\u0072\u0079\u0051\u0075\u0069\u007a\u0043\u0075\u0072\u0072\u0065\u006e\u0074\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1621184990227L,8589935092L,13193,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public String[] XmlReader(int temp){try{__CLR4_4_1a5ya5ykorfooe7.R.inc(13174);
        __CLR4_4_1a5ya5ykorfooe7.R.inc(13175);String tempQ = "Error while loading question";
        __CLR4_4_1a5ya5ykorfooe7.R.inc(13176);String tempA = "Error while loading answer";

        __CLR4_4_1a5ya5ykorfooe7.R.inc(13177);try {
            __CLR4_4_1a5ya5ykorfooe7.R.inc(13178);DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            __CLR4_4_1a5ya5ykorfooe7.R.inc(13179);DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            __CLR4_4_1a5ya5ykorfooe7.R.inc(13180);Document doc = dBuilder.parse(getClass().getResourceAsStream("/xml/questions.xml"));
            __CLR4_4_1a5ya5ykorfooe7.R.inc(13181);doc.getDocumentElement().normalize();
            __CLR4_4_1a5ya5ykorfooe7.R.inc(13182);NodeList nList = doc.getElementsByTagName("element");

            __CLR4_4_1a5ya5ykorfooe7.R.inc(13183);Node nNode = nList.item(temp);
            __CLR4_4_1a5ya5ykorfooe7.R.inc(13184);if ((((nNode.getNodeType() == Node.ELEMENT_NODE)&&(__CLR4_4_1a5ya5ykorfooe7.R.iget(13185)!=0|true))||(__CLR4_4_1a5ya5ykorfooe7.R.iget(13186)==0&false))) {{
                __CLR4_4_1a5ya5ykorfooe7.R.inc(13187);Element eElement = (Element) nNode;
                __CLR4_4_1a5ya5ykorfooe7.R.inc(13188);tempQ = eElement.getElementsByTagName("text").item(0).getTextContent();
                __CLR4_4_1a5ya5ykorfooe7.R.inc(13189);tempA = eElement.getElementsByTagName("answer").item(0).getTextContent();
            }

        }} catch (Exception e) {
            __CLR4_4_1a5ya5ykorfooe7.R.inc(13190);e.printStackTrace();
        }
        __CLR4_4_1a5ya5ykorfooe7.R.inc(13191);String[] selectedQuestion = new String[] {tempQ, tempA};
        __CLR4_4_1a5ya5ykorfooe7.R.inc(13192);return selectedQuestion;
    }finally{__CLR4_4_1a5ya5ykorfooe7.R.flushNeeded();}}
}
