//inline method 'methodToInline'
class InlineMethodTest{
	public void method() {
		class InnerClass {
		}
		methodToInline();
	}
	
	public void methodToInline() {
		class InnerClass {
		}
	}
}

