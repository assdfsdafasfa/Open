class MyClass {
    public void methodToInline(int n) {
        if (n > 0) {
            // 递归调用自身的方法
        	methodToInline(n - 1);
        }
    }
}
class AnotherClass {
    public void callRecursiveMethod() {
        // 在IDE中没有编译错误，但是无法内联 recursiveMethod()
        new MyClass().methodToInline(5);
    }
}