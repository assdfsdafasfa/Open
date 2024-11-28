class ParentClass{
	void methodToBeRenamed(){
		System.out.print("1")；	
	}
}
class SourceClass{
	void method(){
		System.out.print("2")；	
	}
	class InnerClass extends ParentClass{
		void testMethod(){
			method();
		}
	}
}