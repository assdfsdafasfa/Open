class SourceClass extends SuperClass {
    private static TargetClass target;
    public void methodToMove() {
        super.method();
        // Method implementation
    }
}

class SuperClass {
    public static void method() {
        // Superclass method implementation
    }
}

class TargetClass {
    // Move the method here
}
