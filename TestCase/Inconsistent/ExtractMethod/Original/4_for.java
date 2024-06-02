class ExtractMethodTest {
    private final int LIMIT = 10;
    public void originalMethod() {
        // Original method logic
        for (int i = 0; i < LIMIT; i++) {
	  // extract methods
            if (i == 5) {
                break;             }
            System.out.println(i);
        }
    }

}