// extract:'return result', new name 'extracted'
class ExtractMethodTest{
	public synchronized int calculate(int value) {
		int result=1;
		switch(value) {
		case 1:
			result = value*2;
			break;
		default:
			result = value*4;
			break;
		}
		return result;
	}
}

