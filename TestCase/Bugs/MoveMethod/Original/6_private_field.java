
 class SourceClass{
	 // Private field accessed within the method
	    private int privateField;

	    public SourceClass(int privateField) {
	        this.privateField = privateField;
	    }

	    // Move method with parameter of the target class type
	    public void methodToMove(TargetClass.InnerClass target) {
	        int newValue = privateField * target.getValue();
	        System.out.println("New value: " + newValue);
	    }
	}

class TargetClass {
	    static class InnerClass {
	        // Method implementation
	        public int getValue() {
	            return 10;
	        }
	    }
	}
