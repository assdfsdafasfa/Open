abstract class OtherClass{
	protected abstract void methodToBeInlined();
}
class SourceClass extends OtherClass{
	protected void methodToBeInlined(){}
	public void anotherMethod(){
		methodToBeInlined();
	}
}