public class A {
    int i;
    class C {
        B b = null;
    }
}
class B{

    // move methodToMove();
    void methodToMove(A a) {
        a.i = 0;
    }
}