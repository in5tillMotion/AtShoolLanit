package AtSchool;

import org.junit.Test;

public class EnumValues {

    @Test
    public void example1(){
        for(MyHumbleEnum val : MyHumbleEnum.values()){
            System.out.println(val.toString());
        }
    }
    @Test
    public void example2(){
        for(MyHumbleEnum val : MyHumbleEnum.values()){
            if(val == MyHumbleEnum.valueOf("КОНСТАНТА_1")){
                System.out.println("Найдена первая константа");
            }
        }
    }
}
