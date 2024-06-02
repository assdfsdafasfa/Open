public class OriginalClass {
	public void fails() {
		// extract method: foo() 
		foo();
		foo();
		}
	public void foo() {
		foo();	
	}

}