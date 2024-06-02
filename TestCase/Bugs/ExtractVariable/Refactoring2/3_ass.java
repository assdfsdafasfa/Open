 //extract: 'variableToExtract',  new name 'newVariable'
class ExtractVariableTest{
    void method() {
        int variableToExtract;
        if (true) {
            int newVariable = variableToExtract;
            newVariable = 3;
        }
    }
}

