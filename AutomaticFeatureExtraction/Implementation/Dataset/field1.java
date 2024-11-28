class SourceClass{
	public void method1(){
		int variable = 0;
		class InnerClass{
			int fieldToBeRenamed；
			public void method2(){
				fieldToBeRenamed = variable;
			}
		}
	}
}