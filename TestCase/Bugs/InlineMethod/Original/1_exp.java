//inline method 'methodToInline'
class OriginalClass {
    public void methodToInline() throws IOException {
    }
}
class InlineMethodTest {
    public void callerMethod(){
        OriginalClass obj = new OriginalClass();
        try {
            obj.methodToInline();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

