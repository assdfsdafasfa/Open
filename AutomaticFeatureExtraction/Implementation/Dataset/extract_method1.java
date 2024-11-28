class ExtractMethodTest{
	public void methodA(){
		extracted();
	}
	private void extracted(){
		anotherMethod();
	}
	private void anotherMethod(){}
}