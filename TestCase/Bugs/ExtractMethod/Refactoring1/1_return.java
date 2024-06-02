//Extract:'return;', new name 'extracted'
class ExtractMethodTest {
	public void extractMethodTest() {
		Object runnable = null;
		Object[] disposeList = null;
		for (int i = 0; i < disposeList.length; i++) {
			if (disposeList[i] == null) {
				disposeList[i] = runnable;
				extracted();
			}
			System.out.println(disposeList[i]);
		}
	}
	private void extracted() {
	}
}

