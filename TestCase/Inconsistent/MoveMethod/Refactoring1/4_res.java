class SuperClass extends TargetClass{
    TargetClass target;
    public final void methodToMove() {
        Runnable r = () -> {
            // Call to move method
            methodToMove();
        };
        // Other method logic
    }
}

class TargetClass {
    // Move the method here
}