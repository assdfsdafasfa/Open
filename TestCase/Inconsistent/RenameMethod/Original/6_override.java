    abstract class C<T> {
        protected abstract boolean methodToRename(T a);  }
    public abstract class RenameMethod<T extends Object> extends C<T> {        
@Override
// move methodToRename to newMethod
        protected abstract boolean methodToRename(Object a);}
