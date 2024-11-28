 class SourceClass{
	private static int value;
	TargetClass t;
	public  void setValue(int value){
		this.value = value;
	}
	public void dependentMethod(){
		System.out.print(value);
	}
}
class TargetClass{
	public void callDependentMethod(){
		SourceClass source = new SourceClass();
		source.dependentMethod();
	}
}