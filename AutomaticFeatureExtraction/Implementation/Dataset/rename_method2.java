class ParentClass{
	public void methodToBeRenamed(){};
}
class SubClass extends ParentClass implements I{
	public void methodToBeRenamed(){}
}
interface I{
	void methodToBeRenamed();
}