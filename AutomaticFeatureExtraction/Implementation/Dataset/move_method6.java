 class SourceClass extends SuperClass{
	private static TargetClass target;
	public  void methodToMove(){
		super.method();
	}
}
class SuperClass{
	public static void method(){}
}
class TargetClass{}