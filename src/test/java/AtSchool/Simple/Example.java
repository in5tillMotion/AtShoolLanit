package AtSchool.Simple;

import org.junit.Test;

public class Example {
    @Test
    public void test1(){
        SubClass1 obj = new SubClass1();
        obj.variableOfSuperClass = 1;
        obj.superClassMethod();

        SuperClass superObj = new SubClass1();
    }
}
