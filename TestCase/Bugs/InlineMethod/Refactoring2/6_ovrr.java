//inline method 'methodToInline'
abstract class InlineMethodTest {
    protected abstract void abstractMethod();
}
class AnotherClass extends InlineMethodTest {
    @Override
    protected void methodToInline() {
        // Method implementation
    }
    public void anotherMethod() {
    }
}

