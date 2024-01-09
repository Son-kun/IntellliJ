package eu.primaris.intellij;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ParameterClassTest {

    @Test
    public void testMethodA() {
        ParameterClass pc = new ParameterClass();

        Assert.assertEquals(pc.methodA(), "");
    }

}