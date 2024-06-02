//inline method 'methodToInline'
class ExternalClass {
    private ExternalClass externalClass = new ExternalClass();
    public void someMethod() {
        synchronized (externalClass) {
        }
    }
}

