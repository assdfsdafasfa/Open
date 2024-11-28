class SourceClass{
	public void methodToBeInlined() throws IOException{
	}
}
class OtherClass{
	public void callerMethod(){
		SourceClass obj = new SourceClass();
	}
	try{
	}catch(IOException e){
		e.printStackTrace();
	}
}