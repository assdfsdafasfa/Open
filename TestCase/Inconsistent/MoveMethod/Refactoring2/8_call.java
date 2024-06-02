class OriginalClass {
    private SubTargetClass target;

}
class TargetClass {
    public void doSomething() {
        System.out.println("Doing something...");
    }
}
class SubTargetClass extends TargetClass {
    public void methodToMove() {
        doSomething(); 
    }
}