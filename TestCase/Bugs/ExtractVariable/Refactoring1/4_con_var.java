// extract:'text.length() - 1', new name 'newVariable'
class ExtractVariableTest {
    class Test {
        public void doTest() {
            String newVariable = "xxx";
            Runnable runnable = () -> Test.this.toVoid(text.length() - 1);
        }
        private void toVoid(Object o) {
        }}
}