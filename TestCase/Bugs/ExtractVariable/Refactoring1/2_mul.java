// extract variable: arrs[n], new name 'newVariable'
class ExtractVariableTest {
    public void method() {
        int[] arrs = {0,1,2,3};
        int n = 0;
        int extracted = arrs[n];
		System.out.println(extracted);
        n++;
        int extracted2 = arrs[n];
		System.out.println(extracted2);
        n++;
        int extracted3 = arrs[n];
		System.out.println(extracted3);
    }
}



