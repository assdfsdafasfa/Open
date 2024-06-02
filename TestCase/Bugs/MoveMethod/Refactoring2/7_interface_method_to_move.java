interface SourceInterface {
}

class ClassA implements SourceInterface {
    @Override
    public void methodToMove(TargetClass targetClass) {
        System.out.println("Method in ClassA");
    }
}
class ClassB implements SourceInterface {
    @Override
    public void methodToMove(TargetClass targetClass) {
        System.out.println("Method in ClassB");
    }
}

class TargetClass {

	void methodToMove(TargetClass targetClass);
    // Move the method to this class
}