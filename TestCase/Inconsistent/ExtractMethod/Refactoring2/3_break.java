class ExtractMethodTest {
    private final int value;

    public ExtractMethodTest(int value) {
        this.value = value;
    }

    public synchronized int calculate() {
        int result=1;
        switch (value) {
            case 1:
                result = value * 2;
                // extract method
                extracted();
                break;
            case 2:
                result = value * 3;
                break;
            default:
                result = value * 4;
                break;
        }
        return result;
    }

    private static void extracted() {
        return;
    }

    // After extract method, the switch structure will be extracted into a new private final method
    private long calculateSwitchResult() {
        int result;
        // extract method
        switch (value) {
            case 1:
                result = value * 2;
                break;
            case 2:
                result = value * 3;
                break;
            default:
                result = value * 4;
                break;
        }
        return result;
        // extract method
    }
}