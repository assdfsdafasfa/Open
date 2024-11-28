class ParentClass{
	void method(){
		System.out,print("1");
	}
}
class SubClass extends ParentClass{
	void methodToBeRenamed(){
		System.out,print("2");
	}
	void testMethod(){
		method();
	}
}