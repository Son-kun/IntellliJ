package eu.primaris.intellij;

/**
 * Refactor shortCut (Ctrl + Alt + Shift + T)
 */
public class RefactorClass {

    /**
     * Extract to method (Alt + Shift + M)
     */
    public void firsMethod() {
        int i = 1;
        {
            i = i + 1;
        }

        i = i + 1;
        assert i == 3;
    }

    /**
     * Extract delegate
     * @return
     */
    public boolean secondMethod() {
        return Boolean.FALSE;
    }

    /**
     * Inline method (Ctrl + Alt + N)
     * @return
     */
    public boolean thirdMethod() {
        Boolean a = false;
        a = !a;
        return a;
    }

}
