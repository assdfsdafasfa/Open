//rename 'methodToRename' to 'newMethod'
class SubClass implements I, RenameMethodTest{
    public void newMethod(){};
}
interface I{
    void newMethod();
}
interface RenameMethodTest{
    void newMethod();
}

