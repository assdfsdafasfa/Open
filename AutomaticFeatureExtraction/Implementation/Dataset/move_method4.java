 class SourceClass{
	TargetClass t;
	protected class ProtectedInnerClass{
		void innerMethod(){}
	}
	public void myMethod(){
		ProtectedInnerClass inner = new ProtectedInnerClass();
		inner.innerMethod();
	}
}
class TargetClass{
}