package eu.primaris.intellij;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        DebugClass dc = new DebugClass();
        dc.methodA();
        dc.methodB();
        dc.methodC();
        while(true) {
            dc.methodD();
            Thread.sleep(500);
        }
    }

    public static void refactorUsage() {
        RefactorClass refactorClass = new RefactorClass();

        boolean b = refactorClass.thirdMethod();

        assert b;
    }
}
