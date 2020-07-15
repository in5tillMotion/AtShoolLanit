package AtSchool;

import org.junit.Test;

public class  SimpleGeneric <TypeParameter> {

    public void info(TypeParameter param){
        System.out.println("Я работаю с типом: " + param.getClass().getSimpleName());
    }

    @Test
    public void test() {
        SimpleGeneric<String> stringSimpleGeneric = new SimpleGeneric<>();
        stringSimpleGeneric.info("some string");

        SimpleGeneric<Integer> integerSimpleGeneric = new SimpleGeneric<>();
        integerSimpleGeneric.info(5);

        //Так нельзя, потому что считается что это объекты разных классов
        //integerSimpleGeneric = stringSimpleGeneric;
    }
}
