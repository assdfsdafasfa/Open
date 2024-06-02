public class OriginalClass {
	public void fails() {
		extracted();
		extracted();
		}
	private void extracted() {
		foo();
	}
	public void foo() {
		extracted();	
	}

}