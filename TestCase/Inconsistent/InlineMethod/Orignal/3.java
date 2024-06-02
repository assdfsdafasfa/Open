public class OriginalClass {
    public static void methodToInline() {
        // Some logic here
    }
}

// SubClass.java
class SubClass extends OriginalClass {
    public static void methodToInline() {
        // Some other logic here
    }
}

// CallerClass.java
class CallerClass {
    public void callerMethod() {
        // 内联方法后，与现有方法隐藏产生冲突，导致编译错误
        SubClass.methodToInline();
    }
}