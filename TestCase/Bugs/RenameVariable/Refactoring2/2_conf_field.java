// rename 'variableToRename' to 'newField'
class RenameVariableTest {
    protected int newField=1;
    public void testMethod() {
        int newField = 2;
        System.out.println(this.newField);
    }
}

