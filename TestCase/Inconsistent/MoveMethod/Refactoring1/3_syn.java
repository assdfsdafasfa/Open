
class SuperClass extends TargetClass{
    public synchronized void methodToMove(TargetClass target) {
    }
}

class TargetClass {
    public void method() {
    }
    // Move the method here
}
