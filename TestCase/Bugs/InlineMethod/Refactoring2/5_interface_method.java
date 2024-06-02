//inline method 'methodToInline'
interface MyInterface {
    default void methodToInline() {
        System.out.println("Inline method in default method of Inheriting interface classes");
    }
}

class InlineMethodTest implements MyInterface {
}

