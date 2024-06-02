//rename 'methodToRename' to 'newMethod'
class ParentClass { 
	public void newMethod(){} 
	}
class SubClass extends ParentClass implements TargetInterface{
  public void newMethod(){}
}
interface TargetInterface { 
	public void methodToRename(); 
}


