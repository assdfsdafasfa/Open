Eclipse：false; IDEA: true;

// rename I.methodToRename
class A implements I{
	public void methodToRename(){}
}
class B extends A{
	public native void methodToRename();
}
interface I{
	void methodToRename();
}