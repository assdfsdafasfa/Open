class OriginalClass {
    private SubTargetClass target;

    public void methodToMove() {
        target.doSomething(); 
    }
}
class TargetClass {
    public void doSomething() {
        System.out.println("Doing something...");
    }
}
class SubTargetClass extends TargetClass {
}