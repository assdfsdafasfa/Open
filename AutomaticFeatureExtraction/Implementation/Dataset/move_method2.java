interface MyInterface{
	void interfaceMethod(TargetClass t);
}
class MyClass implements MyInterface{
	TargetClass t;
	public void moveMethod(){
		interfaceMethod(t);
	}
	public void interfaceMethod(TargetClass t)	{}
}
class TargetClass{
}