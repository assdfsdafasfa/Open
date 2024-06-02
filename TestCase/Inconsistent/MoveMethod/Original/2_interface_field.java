interface MyInterface {
    int defaultValue = 100;
}
class SourceClass {
	TargetClass target;
	 private void methodToMove() {
	        int value = MyInterface.defaultValue;
	        // Method implementation
	    }
	
}

class TargetClass {
    // Move the method here
}
