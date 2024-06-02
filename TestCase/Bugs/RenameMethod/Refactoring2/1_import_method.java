// rename 'methodToRename' to 'valueOf'
import static java.lang.String.valueOf;
public class RenameMethodTest {
    static String valueOf(int i) { return "1"; }
    public void testMethod() {
        System.out.println(valueOf(10));
    }
}

