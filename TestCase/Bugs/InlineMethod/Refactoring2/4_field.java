//inline method 'methodToInline'
class MyClass {
    private static int value = 1;
}
class InlineMethodTest {
    private int value = 1;
    public void callStaticMethod() {
        System.out.println("Value: " + MyClass.value);
    }
}

