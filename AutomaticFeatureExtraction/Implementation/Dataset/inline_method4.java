class SourceClass{
	private boolean flag = false;
	public synchronized void methodToBeInlined() throws InterruptedException{
		flag = true;
	}
	public void callerMethod() throws InterruptedException{
		methodToBeInlined();
	}
}