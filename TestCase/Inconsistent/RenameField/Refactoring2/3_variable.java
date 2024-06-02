class A {
    // rename m1 to newField;
    int newField = 123;
    public void f() {
        int newField = 123;
        class B{
            public void b() {
                System.out.println(A.this.newField);
            }
        }
    }
}
