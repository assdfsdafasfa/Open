// inline method 'methodToInline'
class MyClass {
    private static int value = 1;
    public static void methodToInline() {
        System.out.println("Value: " + value);
    }
}
class InlineMethodTest {
    private int value = 1;
    public void callStaticMethod() {
        new MyClass().methodToInline(); 
    }
}

