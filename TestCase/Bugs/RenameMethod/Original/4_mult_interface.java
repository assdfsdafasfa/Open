//rename 'methodToRename' to 'newMethod'
class SubClass implements I, RenameMethodTest{
    public void methodToRename(){};
}
interface I{
    void methodToRename();
}
interface RenameMethodTest{
    void methodToRename();
}

