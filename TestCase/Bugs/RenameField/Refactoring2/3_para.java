// rename 'fieldToRename' to 'newField'
class RenameMethodTest {
    int newField = 1;
    public void anotherMethod(int newField) {
        int localVar = newField; 
        System.out.println(newField);
    }
}

