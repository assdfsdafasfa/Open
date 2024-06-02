class SourceClass {
    TargetClass v;
}

class TargetClass {
    public void methodToMove(String value) {
        System.out.println("Method with String parameter: " + value);
    }

    public void methodToMove(int value) {
        System.out.println("Method with int parameter: " + value);
    }
}