Eclipse：false; IDEA: true;

// rename I.m
class A implements I{
	public void newMethod(){}
}
class B extends A{
	public native void newMethod();
}
interface I{
	void newMethod();
}