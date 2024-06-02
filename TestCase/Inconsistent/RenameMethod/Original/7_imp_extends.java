public class A1 extends C3{
    class A2 extends C<Object> implements A<Object> {
        public void methodToRename(Object o) {
        }
    }
}

class C3 {
    class C<E> {
        public void methodToRename(E e) {
        }
    }
}

interface A<T> {
    void methodToRename(T t);
}
