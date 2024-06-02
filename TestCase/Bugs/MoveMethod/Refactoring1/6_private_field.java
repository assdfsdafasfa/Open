
class SourceClass{
	 // Private field accessed within the method
	    private int privateField;

	    public SourceClass(int privateField) {
	        this.privateField = privateField;
	    }
	}

class TargetClass {
	    static class InnerClass {
	        // Method implementation
	        public int getValue() {
	            return 10;
	        }

			public void methodToMove(SourceClass sourceClass) {
			    int newValue = sourceClass.privateField * getValue();
			    System.out.println("New value: " + newValue);
			}
	    }
	}

