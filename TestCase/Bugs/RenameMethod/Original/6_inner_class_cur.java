// rename 'methodToRename' to 'newMethod'
public class RenameMethodTest {
    public void methodToRename(){}
    class InnerClass{
      void newMethod(){
       methodToRename();
      }
    }
}
