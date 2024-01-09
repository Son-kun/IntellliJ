package eu.primaris.intellij;

import java.util.ArrayList;
import java.util.List;

public class CodeCompletion {

    /**
     * Automatic code completion examples (Ctrl + Space)
     */
    public void codeCompletion() {
        // Object name

        // String with "

        // List with suggested names

    }

    /**
     * Replace and addition
     */
    public void tabVsEnter() {
        List<Object> list;
    }

    /**
     * Smart code completion examples (Ctrl + Shift + Space)
     */
    public String smartCompletion() {
        String first = "aaa";
        String seccond = "bbb";

        List<String> list;

        return first;
    }

    /**
     * Postfix code completion (. + Ctrl + Space)
     * @return
     */
    public boolean postCompletion() {
        // for
        List<String> list = new ArrayList<>();

        // SystemOutPrintLn
//        "postCompletion".

        // not
        return Boolean.FALSE;
    }

    /**
     * Other language in text completion
     */
    public void inTextCompletion() {
        String someJsCode = "function test()";
    }

    /**
     * Show parameter alternatives for contructor (Ctrl + P) and methods (Ctrl + Q)
     */
    public void parameters() {
        ParameterClass parameterClass = new ParameterClass();

        parameterClass.methodA();
    }
}
