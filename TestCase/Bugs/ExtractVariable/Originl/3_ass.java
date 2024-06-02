 //extract: 'variableToExtract',  new name 'newVariable'
class ExtractVariableTest{
  void method() {
        int variableToExtract;
        if (true) {
            variableToExtract = 3; 
        }
    }
}