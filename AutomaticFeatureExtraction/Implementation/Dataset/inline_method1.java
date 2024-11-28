class SourceClass{
	public void method(int i){
		class InnerClass{}
		methodToBeInlined();
	}
	public void methodToBeInlined(){
		class InnerClass{}
	}
}