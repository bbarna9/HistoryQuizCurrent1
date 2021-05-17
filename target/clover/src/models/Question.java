/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package models;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * The Question model is the base of the entire program. It consists of two Strings: a question and an answer.
 * The class itself contains the getters-and-setters, and the {@code loadNewQuestion()} function. This instantiates
 * an {@link PersonalXmlReader} with a random number passed to it as a parameter, and we pass that randomly loaded question
 * on to the question, and return with the question itself.
 */

@Slf4j
public class Question {public static class __CLR4_4_15555kosgyytp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0062\u0061\u0072\u006e\u0061\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0066\u0065\u006a\u0065\u006c\u0073\u007a\u0074\u0065\u0073\u002f\u0048\u0069\u0073\u0074\u006f\u0072\u0079\u0051\u0075\u0069\u007a\u0043\u0075\u0072\u0072\u0065\u006e\u0074\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1621247615900L,8589935092L,202,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String question;
    private String answer;

    public String getQuestion() {try{__CLR4_4_15555kosgyytp.R.inc(185);
        __CLR4_4_15555kosgyytp.R.inc(186);return question;
    }finally{__CLR4_4_15555kosgyytp.R.flushNeeded();}}

    public void setQuestion(String question) {try{__CLR4_4_15555kosgyytp.R.inc(187);
        __CLR4_4_15555kosgyytp.R.inc(188);this.question = question;
    }finally{__CLR4_4_15555kosgyytp.R.flushNeeded();}}

    public String getAnswer() {try{__CLR4_4_15555kosgyytp.R.inc(189);
        __CLR4_4_15555kosgyytp.R.inc(190);return answer;
    }finally{__CLR4_4_15555kosgyytp.R.flushNeeded();}}

    public void setAnswer(String answer) {try{__CLR4_4_15555kosgyytp.R.inc(191);
        __CLR4_4_15555kosgyytp.R.inc(192);this.answer = answer;
    }finally{__CLR4_4_15555kosgyytp.R.flushNeeded();}}

    public static Question loadNewQuestion(){try{__CLR4_4_15555kosgyytp.R.inc(193);
        __CLR4_4_15555kosgyytp.R.inc(194);Question question = new Question();
        __CLR4_4_15555kosgyytp.R.inc(195);Random random = new Random();
        __CLR4_4_15555kosgyytp.R.inc(196);int rand = random.nextInt(70);
        __CLR4_4_15555kosgyytp.R.inc(197);PersonalXmlReader reader = new PersonalXmlReader();
        __CLR4_4_15555kosgyytp.R.inc(198);String[] data = reader.XmlReader(rand);
        __CLR4_4_15555kosgyytp.R.inc(199);question.setQuestion(data[0]);
        __CLR4_4_15555kosgyytp.R.inc(200);question.setAnswer(data[1]);
        __CLR4_4_15555kosgyytp.R.inc(201);return question;
    }finally{__CLR4_4_15555kosgyytp.R.flushNeeded();}}
}