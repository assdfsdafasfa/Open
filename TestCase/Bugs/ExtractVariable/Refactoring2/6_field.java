//extract variable:'1', new variable name "newVariable"
class ExtractVariableTest {
    int newVariable=2;
    public void method() {
    	int newVariable=1;
        int variable = newVariable; 
        System.out.println(newVariable);
    }
}

