/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package main;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class XmlReader {public static class __CLR4_4_1mmmmkoka7ske{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0062\u0061\u0072\u006e\u0061\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0066\u0065\u006a\u0065\u006c\u0073\u007a\u0074\u0065\u0073\u002f\u0048\u0069\u0073\u0074\u006f\u0072\u0079\u0051\u0075\u0069\u007a\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1620752541214L,8589935092L,840,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String FILENAME = "/home/barna/Szoftverfejelsztes/HistoryQuiz/questions.xml";

    public static void main(String[] args) {try{__CLR4_4_1mmmmkoka7ske.R.inc(814);
        __CLR4_4_1mmmmkoka7ske.R.inc(815);DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        __CLR4_4_1mmmmkoka7ske.R.inc(816);try {

            __CLR4_4_1mmmmkoka7ske.R.inc(817);dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);

            __CLR4_4_1mmmmkoka7ske.R.inc(818);DocumentBuilder db = dbf.newDocumentBuilder();
            __CLR4_4_1mmmmkoka7ske.R.inc(819);Document doc = db.parse(new File(FILENAME));

            __CLR4_4_1mmmmkoka7ske.R.inc(820);doc.getDocumentElement().normalize();

            __CLR4_4_1mmmmkoka7ske.R.inc(821);System.out.println("Root Element :" + doc.getDocumentElement().getNodeName());
            __CLR4_4_1mmmmkoka7ske.R.inc(822);System.out.println("------");
            __CLR4_4_1mmmmkoka7ske.R.inc(823);NodeList list = doc.getElementsByTagName("question");

            __CLR4_4_1mmmmkoka7ske.R.inc(824);for (int temp = 0; (((temp < list.getLength())&&(__CLR4_4_1mmmmkoka7ske.R.iget(825)!=0|true))||(__CLR4_4_1mmmmkoka7ske.R.iget(826)==0&false)); temp++) {{

                __CLR4_4_1mmmmkoka7ske.R.inc(827);Node node = list.item(temp);

                __CLR4_4_1mmmmkoka7ske.R.inc(828);if ((((node.getNodeType() == Node.ELEMENT_NODE)&&(__CLR4_4_1mmmmkoka7ske.R.iget(829)!=0|true))||(__CLR4_4_1mmmmkoka7ske.R.iget(830)==0&false))) {{

                    __CLR4_4_1mmmmkoka7ske.R.inc(831);Element element = (Element) node;

                    __CLR4_4_1mmmmkoka7ske.R.inc(832);String id = element.getAttribute("id");

                    __CLR4_4_1mmmmkoka7ske.R.inc(833);String answer = element.getElementsByTagName("answer").item(0).getTextContent();
                    __CLR4_4_1mmmmkoka7ske.R.inc(834);String text = element.getElementsByTagName("text").item(0).getTextContent();

                    __CLR4_4_1mmmmkoka7ske.R.inc(835);System.out.println("Current Element :" + node.getNodeName());
                    __CLR4_4_1mmmmkoka7ske.R.inc(836);System.out.println("Question Id : " + id);
                    __CLR4_4_1mmmmkoka7ske.R.inc(837);System.out.println("Answer : " + answer);
                    __CLR4_4_1mmmmkoka7ske.R.inc(838);System.out.println("Text : " + text);
                }
            }}

        }} catch (ParserConfigurationException | SAXException | IOException e) {
            __CLR4_4_1mmmmkoka7ske.R.inc(839);e.printStackTrace();
        }

    }finally{__CLR4_4_1mmmmkoka7ske.R.flushNeeded();}}

}