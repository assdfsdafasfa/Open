class SourceClass {
	interface InnerInterface {
        void method();
    }

    static class InnerClass implements InnerInterface {
        @Override
        public void method() {
            System.out.println("Method implementation in InnerClass");
        }
    }
    TargetClass targetClass;
}

 class TargetClass {

	public void methodToMove(InnerInterface obj) {
	    obj.method();
	}
    // Move the method to this class
}
