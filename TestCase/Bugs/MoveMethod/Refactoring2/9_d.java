class SourceClass {
	 private SourceClass() {
	        System.out.println("Private constructor of SourceClass");
	    }
	}

class TargetClass {

	public void methodToMove() {
		 SourceClass source = new SourceClass();
	}
	    // Move the method to this class
	}
