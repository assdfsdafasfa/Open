// extract:'super',  new name 'newVariable'
public class OrignalClass {}
 class AbstractClass {
  void originalMethod() {};
}
class ConcreteClass extends AbstractClass {
    void extractedMethod() {
        AbstractClass newVariable = super;
        newVariable.originalMethod();
    }
}

