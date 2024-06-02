//rename 'methodToRename' to 'newMethod'
class RenameMethodTest {
    void methodToRename() { 
        System.out.println("A");
    }
}
class AnotherClass {
    void newMethod() {
        System.out.println("B");
    }
    class InnerClass extends RenameMethodTest {
        void testMethod() {
        	newMethod();
        }
    }
}

