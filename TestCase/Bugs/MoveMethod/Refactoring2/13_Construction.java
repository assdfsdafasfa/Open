public class OriginalClass {
    TargetClass c;
    private OriginalClass() {
    }
}

public class TargetClass{

	public void methodToMove() {
	    OriginalClass instance = new OriginalClass();
	}

}