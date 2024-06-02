interface MyInterface {
     default void methodToInline() {
        System.out.println("Inline method in default method of Inheriting interface classes");
    }
}

class cxlass implements MyInterface {
    public static void main(String[] args) {
    	cxlass obj = new cxlass();
    	//inline method
        ((MyInterface) obj).methodToInline();
    }

	@Override
	public void methodToInline() {
		// TODO Auto-generated method stub
		
	}
}