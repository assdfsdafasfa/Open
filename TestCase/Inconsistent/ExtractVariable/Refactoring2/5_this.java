public class OriginalClass {
    public int fState= 0;
    public void foo() {
        OriginalClass newVariable = this;
        fState = newVariable.fState;
    }
}