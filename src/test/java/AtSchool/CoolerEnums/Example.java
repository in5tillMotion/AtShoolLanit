package AtSchool.CoolerEnums;

import org.junit.Test;

public class Example {
    @Test
    public void example(){
        for(PredefinedColors color : PredefinedColors.values()){
            System.out.println(color);
        }

        PredefinedColors color = PredefinedColors.GREEN;
        color.method();
    }
}
