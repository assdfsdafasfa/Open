import java.lang.String.valueOf;
class RenameMethodTest{
	static String valueOf(int i){return null;}
	public void methodToBeRenamed(){
		System.out.print(valueOf(1));
	}
}