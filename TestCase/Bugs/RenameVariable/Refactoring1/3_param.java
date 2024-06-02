//rename 'variableToRename' to 'newVariable'
class RenameVaraibleTest {
    void method1(){
        int newVariable= 0;
        AnotherClass a= new AnotherClass(){
            void method2(int variableToRename){
                variableToRename= newVariable;
            }
        };
    }
}
class AnotherClass{
}

