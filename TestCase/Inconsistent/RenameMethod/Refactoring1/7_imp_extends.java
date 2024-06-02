public class A1 extends C3{
    class A2 extends C<Object> implements A<Object> {
        public void newMethod(Object o) {
        }
    }
}

class C3 {
    class C<E> {
        public void newMethod(E e) {
        }
    }
}

interface A<T> {
    void newMethod(T t);
}
