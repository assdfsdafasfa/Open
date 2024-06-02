class OriginalClass {
        int value;
    TargetClass c;
    {//methodToMove
        value = 10; // 实例初始化块中的赋值操作
    }
}

// TargetClass.java
class TargetClass {
   
}