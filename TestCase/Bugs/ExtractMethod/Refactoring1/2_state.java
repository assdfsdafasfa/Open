//extract:' this.value = value;', new name 'extracted'
class ExtractMethodTest {
	 private final int value;
	    public ExtractMethodTest(int value) {
	        extracted(value);
	    }
		private void extracted(int value) {
			this.value = value;
		}
}