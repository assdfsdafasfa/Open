public class OriginalClass {
    TargetEnum m;
    protected void methodToMove() {
        // Some logic here
    }

    public void n(){
    	methodToMove();
    }
}

public @interface TargetEnum {

}

