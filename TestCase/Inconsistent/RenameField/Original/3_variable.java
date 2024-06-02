class A {   
  // rename fieldToRename to newField;
    int fieldToRename = 123;
    public void f() {
	int newField = 123;
	class B{
	       public void b() {
	            System.out.println(fieldToRename);
			}
		}
	}
}
