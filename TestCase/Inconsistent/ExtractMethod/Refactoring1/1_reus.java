class OriginalClass {
    public void fails() {
        // extract method: foo() 
        foo();
        extracted();
    }
    private void extracted() {
        foo();
    }
    public void foo() {
        foo();
    }

}