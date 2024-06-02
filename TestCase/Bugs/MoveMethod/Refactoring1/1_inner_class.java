class SourceClass {
    private TargetClass target;
    // move method "methodToMove" to "TargetClass"
    public void methodToMove() {
        // Method logic
        int result = InnerClass.CONSTANT_VALUE * 2;
        target.doSomething();
    }

    // Inner class
    static class InnerClass {
        private static final int CONSTANT_VALUE = 10;
    }
}

// Target class
class TargetClass {
    public void doSomething() {
        // Method logic
    }
}
	