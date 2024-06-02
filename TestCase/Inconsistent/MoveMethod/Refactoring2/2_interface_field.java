interface MyInterface {
    int defaultValue = 100;
}
class SourceClass {
    TargetClass target;

}
class TargetClass {
    private void methodToMove() {
        int value = MyInterface.defaultValue;
        // Method implementation
    }
    // Move the method here
}