class SourceClass {
    private TargetClass target;
    // Inner class
    static class InnerClass {
        private static final int CONSTANT_VALUE = 10;
    }
}

// Target class
class TargetClass {
    public void doSomething() {
        // Method logic
    }
	public void methodToMove() {
	    // Method logic
	    int result = InnerClass.CONSTANT_VALUE * 2;
	    doSomething();
	}
}
	