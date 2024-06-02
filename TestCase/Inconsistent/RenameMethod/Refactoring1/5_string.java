class MyClass {
    public void newMethod() {
        System.out.println("Old method");
    }

    public static void main(String[] args) {
        try {
            MyClass obj = new MyClass();
            Method method = MyClass.class.getMethod("newMethod");
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}