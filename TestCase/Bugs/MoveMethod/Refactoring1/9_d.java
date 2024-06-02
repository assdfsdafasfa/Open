class SourceClass {
	 private SourceClass() {
	        System.out.println("Private constructor of SourceClass");
	    }

	    public void methodToMove(TargetClass targetClass) {
	    	 SourceClass source = new SourceClass();
	    }
	}

class TargetClass {
	    // Move the method to this class
	}
