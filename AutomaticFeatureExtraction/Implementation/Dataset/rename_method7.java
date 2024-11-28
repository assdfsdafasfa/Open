class SoureClass{
	public void methodToBeRenamed(){}
	class InnerClass{
		void method(){
			methodToBeRenamed();
		}
	}
}