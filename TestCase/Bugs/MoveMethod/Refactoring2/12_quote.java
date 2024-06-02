class SourceClass{
    private TargetClass target;

    public SourceClass(TargetClass target) {
        this.target = target;
    }

}

interface TargetClass {
    Object abstractField = null;

    void methodWithSameName();

    default void methodToMove(SourceClass sourceClass) {
        ((TargetClass) sourceClass.target.abstractField).methodWithSameName();
    }
}