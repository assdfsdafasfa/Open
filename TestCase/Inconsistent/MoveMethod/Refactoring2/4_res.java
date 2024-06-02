class SuperClass extends TargetClass{
    TargetClass target;
}

class TargetClass {
    public final void methodToMove() {
        Runnable r = () -> {
            // Call to move method
            methodToMove();
        };
        // Other method logic
    }
    // Move the method here
}