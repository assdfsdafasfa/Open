interface B{
    int newField= 0;
}
class A implements B{
    int m(){
        // rename fieldToRename to  newField
        int newField=0;
        newField = B.newField;
        return 0;
    };
}