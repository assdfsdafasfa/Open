class SourceClass {

    TargetClass target;

}
enum TargetClass {
    ;

    private final void methodToMove(SourceClass sourceClass) {
        // Method implementation
        sourceClass.target = this;
    }
}
