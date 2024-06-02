class SourceClass {
	TargetClass target
    public void methodToMove() {		
		System.out.print("move");
		anotherMethod();
	}

	private void anotherMethod() {
		System.out.print("another");
	}
}

class TargetClass {
    // Move the method here
}

