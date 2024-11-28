class SourceClass{
	public void method(){
		int variableToBeRenamed = 2;
		class InnerClass{
			int field = 1;
			void method2（）{
				field = variableToBeRenamed;
			}
		}
	}
}