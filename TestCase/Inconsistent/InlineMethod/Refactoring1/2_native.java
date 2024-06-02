class ExternalClass {
    public native void methodToInline();
}
class MyClass {
    private ExternalClass externalClass = new ExternalClass();

    public void someMethod() {
        // Call to the native method which will be refactored inline
        externalClass.methodToInline();
        // Other code...
    }
}