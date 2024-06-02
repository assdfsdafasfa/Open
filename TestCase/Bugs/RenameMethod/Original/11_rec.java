 // rename 'methodToRename' to 'newMethod'
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
class SomeService {
    public void methodToRename() {
    }
}

class RenameMethodTest {
    void testCase3() throws NoSuchMethodException, SecurityException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        Method method = SomeService.class.getMethod("methodToRename", null);
        method.invoke(new SomeService());
    }
}

