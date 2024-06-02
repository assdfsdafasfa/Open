 // Extract method: 'extracted();', new name 'methodToExtract'
class ExtractMethodTest {
   public  void originalMethod() {};
    public void methodA() {
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

