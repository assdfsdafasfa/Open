class SourceClass{
	private static int value = 1;
	public static void methodToBeInlined(){
		System.out.print(value);
	}
}
class OtherClass{
	public void callerMethod(){
		new SourceClass.methodToBeInlined();
	}
}