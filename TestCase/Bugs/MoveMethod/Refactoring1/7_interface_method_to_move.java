interface SourceInterface {
    void methodToMove(TargetClass targetClass);
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
    // Move the method to this class
}