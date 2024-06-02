public class OriginalClass {
    TargetEnum m;

    public void n(){
        m.methodToMove();
    }
}

public @interface TargetEnum {

    default void methodToMove() {
        // Some logic here
    }
}
