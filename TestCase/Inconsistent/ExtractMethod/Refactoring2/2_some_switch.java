class ExtractMethodTest {
    private final int value;

    public ExtractMethodTest(int value) {
        this.value = value;
    }

    public synchronized int calculate() {
        int result = 1;
        return extracted();
    }

    private int extracted() {
        int result;
        switch (value) {
            case 1:
                result = value * 2;
                break;
            case 2:
                result = value * 3;
                break;
            // extract method
            default:
                result = value * 4;
                break;
        }
        return result;
    }
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