
class SourceClass {
	private void anotherMethod() {
		System.out.print("another");
	}
}

class TargetClass {
    // Move the method here
	public void methodToMove(SourceClass sourceClass) {
	    sourceClass.anotherMethod();
	    // Method implementation
	}
}

