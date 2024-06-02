// extract: 'switch', new name 'extracted'
class ExtractMethodTest {
    public synchronized int calculate(int value) {
        int result;
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
    }
}