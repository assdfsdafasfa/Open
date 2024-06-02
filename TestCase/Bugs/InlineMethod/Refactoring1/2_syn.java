//inline method 'methodToInline'
class ExternalClass {
    public synchronized void methodToInline() {};
}
class InlineMethodTest {
    private ExternalClass externalClass = new ExternalClass();
    public void someMethod() {
        externalClass.methodToInline();
    }
}