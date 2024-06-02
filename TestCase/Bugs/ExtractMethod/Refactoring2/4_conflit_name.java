
// Extract method: 'extracted();', new name 'methodToExtract'
class ExtractMethodTest {
    public  void originalMethod() {};
    public void methodA() {
    	methodToExtract();
    }

    private void methodToExtract() {
        extracted();
    }

    private void extracted() {
    	methodToExtract();
    }
    private void methodToExtract() {
    }
    public void methodB() {
        extracted();
    }
}

