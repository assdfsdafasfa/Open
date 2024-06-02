// rename 'variableToRename' to 'newField'
class RenameVariableTest {
    protected int newField=1;
    public void testMethod() {
        int variableToRename = 2;
        System.out.println(newField);
    }
}