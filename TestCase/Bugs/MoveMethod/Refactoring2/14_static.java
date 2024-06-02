class OriginalClass {
    int value;
TargetClass c;
}

//TargetClass.java
class TargetClass {

	{//move method
	    value = 10; // 实例初始化块中的赋值操作
	}

}