package eu.primaris.intellij;

public class ParameterClass {

    private String a = "a";
    private String b = "b";

    public ParameterClass(String a) {
        this.a = a;
    }

    public ParameterClass(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public ParameterClass() {
    }


    public String methodA() {
        return "";
    }

    public String methodA(String a) {
        return a;
    }

    public String methodA(String a, String b) {
        return a.concat(b);
    }
}
