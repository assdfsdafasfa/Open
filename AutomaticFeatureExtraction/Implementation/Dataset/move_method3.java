class SourceClass{
	TargetClass t;
	private OriginalClass(){}
	public void method(){
		OriginalClass instance = new OriginalClass();
	}	
}
class TargetClass{
}