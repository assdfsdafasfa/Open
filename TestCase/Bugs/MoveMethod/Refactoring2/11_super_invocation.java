class SourceClass extends SuperClass {
    private static TargetClass target;
}

class SuperClass {
    public static void method() {
        // Superclass method implementation
    }
}

class TargetClass {
    public void methodToMove() {
        super.method();
        // Method implementation
    }
    // Move the method here
}