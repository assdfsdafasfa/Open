//rename 'methodToRename' to 'newMethod'
class ParentClass { 
	public void methodToRename(){} 
	}
class SubClass extends ParentClass implements TargetInterface{
  public void methodToRename(){}
}
interface TargetInterface { 
	public void methodToRename(); 
}


