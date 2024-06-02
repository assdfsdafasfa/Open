class SourceClass {
	 TargetClass target;
	public SourceClass(TargetClass target) {
	    this.target = target;
	}
	}
	interface TargetClass {
	void methodInInterface();

	final default void methodToMove(SourceClass sourceClass) {
	    // Method implementation
		 sourceClass.target = this;
	}
	}
