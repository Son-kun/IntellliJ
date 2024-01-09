package eu.primaris.intellij;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.jetbrains.com/help/idea/using-breakpoints.html#0
 */
public class DebugClass {

    List<Integer> list = new ArrayList<>();

    int a;

    /**
     * Simple debug
     *
     * @return
     */
    public Integer methodA() {
        Integer a = 1;
        Integer b = 2;

        return a + b;
    }

    /**
     * Advanced debug + variable watch
     */
    public void methodB() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            a = i;
            Thread.sleep(100);
        }
    }

    /**
     * method breakpoint
     */
    public void methodC() {
        int b;
        b = 0;
    }

    public void methodD() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        Thread.sleep(100);
    }

}
