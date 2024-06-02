//Eclipse error, rename A.methodToRename() to newMethod()
public class A  implements I{
    public void newMethod(String m){
    }
}
class B extends A{
    public void newMethod(Object m){
    }
}
interface I{
    void newMethod(String k);
}