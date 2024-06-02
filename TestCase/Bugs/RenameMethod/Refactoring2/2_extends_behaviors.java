// rename 'methodToRename' to 'newMethod'
public class RenameMethodTest {
    void newMethod(Object m){
        System.out.println("A");
    }
}
class SubClass extends RenameMethodTest{
    void newMethod(String m){
        System.out.println("B");
    }
    void testMethod(){
    	newMethod("A");
    }
}


