class SourceClass {
    public synchronized native void methodToMove(TargetClass target) ;
        // Method implementation
    }

class TargetClass {
    // Move the method here
}