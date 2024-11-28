 class SourceClass{
	TargetClass tartget;
	public SourceClass(TargetClass target){
		this.target = target;
	}
	private final void methodToBeMoved(TargetClass target){
		this.target = target;	
	}
}
interface TargetClass{
	void methodInterface();
}