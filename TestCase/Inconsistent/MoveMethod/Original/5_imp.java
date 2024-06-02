class SourceClass {
    public static void method(TargetClass target) {
    }
}

interface TargetClass {
    void methodToMove(SourceClass target);
}

class ConcreteClass implements TargetClass {
    // move method
    @Override
    public void methodToMove(SourceClass target) {
        // Implementation of method in interface
    }

    TargetClass target;

    public void someMethod() {
        // Call to the move method
        SourceClass.method(this);
    }
}